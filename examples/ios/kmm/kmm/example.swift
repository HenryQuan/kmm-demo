//
//  example.swift
//  kmm
//
//  Created by Yiheng Quan on 22/8/2023.
//

import Foundation
import shared

/// https://stackoverflow.com/a/76626156
/// User Script Sanboxing should be NO
class Example {
    func getIpLocation() {
        IpService().getIpLocation { location, error in
            print(location?.description)
        }
    }
    
    func error() {
        do {
            try ErrorExample().throwError(with: 1)
        } catch {
            print(error)
        }
        
    }
    
    func tryThrow() {
        do {
            try ErrorExample.shared.throwSharedError()
        } catch {
            print(error)
        }
        
        ErrorExample.shared.returnError()
    }
    
    func tryResult() -> KMMResult<NSString, SharedError> {
        let failed = ErrorExample.shared.returnResultFailure()
        switch failed.errorOrNull() {
        case .none:
            print("Nothing")
        case .some(.NoInternet()):
            print("Internet")
        case .some(_):
            print("Others")
        }
        let success = ErrorExample.shared.returnResultSuccess()
        return failed
    }
    
    private let json = "{\"status\":\"success\",\"country\":\"Australia\",\"countryCode\":\"AU\",\"region\":\"NSW\",\"regionName\":\"New South Wales\",\"city\":\"Sydney\",\"zip\":\"2000\",\"lat\":-33.8715,\"lon\":151.2006,\"timezone\":\"Australia/Sydney\",\"isp\":\"TPG Internet Pty Ltd\",\"org\":\"iiNet Limited\",\"as\":\"AS7545 TPG Telecom Limited\",\"query\":\"1.2.3.4\"}"
    
    func decodeKotlinModel() -> IpLocation? {
        let result = try? JSONUtil().decodeIpLocation(string: json)
        return result
    }
}


