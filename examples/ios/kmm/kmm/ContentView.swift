//
//  ContentView.swift
//  kmm
//
//  Created by Yiheng Quan on 22/8/2023.
//

import SwiftUI
import shared

struct ContentView: View {
    @State var ipInfo: String?
    let example = Example()
    var body: some View {
        VStack {
            Image(systemName: "globe")
                .imageScale(.large)
                .foregroundStyle(.tint)
            Text("Hello, world!")
            Button("Hello") {
                let result = example.tryResult()
                print(result.errorOrNull() as Any)
                example.tryThrow()
            }
            
            if let info = ipInfo {
                Text(info)
            }
        }
        .padding()
        .onAppear(perform: {
//            IpService().getIpLocation { location, error in
//                ipInfo = location?.description()
//            }
            ipInfo = Example().decodeKotlinModel()?.description()
        })
    }
}

#Preview {
    ContentView()
}
