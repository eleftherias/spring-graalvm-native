#!/usr/bin/env bash
if [[ `cat target/native-image/test-output.txt | grep "Started SecurityThymeleafApplication"` ]]; then
  exit 0
else
  exit 1
fi
