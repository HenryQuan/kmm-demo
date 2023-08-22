'use client';
import Image from 'next/image';
import { useState, useEffect } from "react";
import * as kmm from "kmmdemo";
import Example from './example';

const example = new Example();

export default function Home() {
  const [ipLocation, setIpLocation] = useState<kmm.io.github.henryquan.kmmdemo.models.IpLocation | null>(null);

  useEffect(() => {
    // const service = new kmm.io.github.henryquan.kmmdemo.services.IpServiceJs();
    // service.getIpLocationJs().then((ipLocation) => {
    //   setIpLocation(ipLocation);
    // });

    setIpLocation(example.parseModel());

    const result = example.resultExample();
    console.log(result.valueOrNull()?.toString());
    example.throwExample();
  }, []);

  return (
    <main className='flex flex-col items-center justify-center w-screen h-screen'>
      Hello World
      <button className='px-4 py-2 mt-4 text-white bg-blue-500 rounded-md hover:bg-blue-600' onClick={() => alert('Hello World')}>
        Button
      </button>
      <p>ipLocation</p>
      <p className='flex items-center justify-center w-full max-w-md'>
        {ipLocation?.toString()}
      </p>
    </main>
  );
}