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
            print(location?.description())
        }
    }
    
    func error() {
        ErrorExample().throwError(with: 1)
    }
    
    func tryResult() {
    }
}
