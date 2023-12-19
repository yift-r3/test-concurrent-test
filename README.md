```
 Task :lib:test

TestIsonOne > one() STANDARD_OUT
    Starting test.concurrent.test.TestIsonOne:one
    Done test.concurrent.test.TestIsonOne:one

TestIsonOne > two() STANDARD_OUT
    Starting test.concurrent.test.TestIsonOne:two
    Done test.concurrent.test.TestIsonOne:two

TestIsonOne > three() STANDARD_OUT
    Starting test.concurrent.test.TestIsonOne:three
    Done test.concurrent.test.TestIsonOne:three

TestSameOne > one() STANDARD_OUT
    Starting test.concurrent.test.TestSameOne:one

TestThree > one() STANDARD_OUT
    Starting test.concurrent.test.TestTwo:one
    Starting test.concurrent.test.TestOne:one
    Starting test.concurrent.test.TestThree:one
    Done test.concurrent.test.TestSameOne:one

TestSameOne STANDARD_OUT
    Done test.concurrent.test.TestTwo:one
    Done test.concurrent.test.TestOne:one
    Done test.concurrent.test.TestThree:one

TestTwo > six() STANDARD_OUT
    Starting test.concurrent.test.TestSameOne:two

TestThree > six() STANDARD_OUT
    Starting test.concurrent.test.TestTwo:six

TestOne > six() STANDARD_OUT
    Starting test.concurrent.test.TestThree:six
    Starting test.concurrent.test.TestOne:six
    Done test.concurrent.test.TestSameOne:two

TestSameOne STANDARD_OUT
    Done test.concurrent.test.TestTwo:six

TestTwo STANDARD_OUT
    Done test.concurrent.test.TestThree:six

TestThree STANDARD_OUT
    Done test.concurrent.test.TestOne:six

TestThree > two() STANDARD_OUT
    Starting test.concurrent.test.TestTwo:two
    Starting test.concurrent.test.TestSameOne:three

TestOne > two() STANDARD_OUT
    Starting test.concurrent.test.TestThree:two
    Starting test.concurrent.test.TestOne:two
    Done test.concurrent.test.TestTwo:two
    Done test.concurrent.test.TestSameOne:three

TestTwo STANDARD_OUT
    Done test.concurrent.test.TestThree:two

TestThree STANDARD_OUT
    Done test.concurrent.test.TestOne:two

TestThree > five() STANDARD_OUT
    Starting test.concurrent.test.TestTwo:five

TestOne > five() STANDARD_OUT
    Starting test.concurrent.test.TestThree:five

TestSameTwo STANDARD_OUT
    Starting test.concurrent.test.TestOne:five

TestSameTwo > one() STANDARD_OUT
    Starting test.concurrent.test.TestSameTwo:one
    Done test.concurrent.test.TestTwo:five

TestTwo STANDARD_OUT
    Done test.concurrent.test.TestThree:five

TestThree STANDARD_OUT
    Done test.concurrent.test.TestOne:five

TestThree > four() STANDARD_OUT
    Starting test.concurrent.test.TestTwo:four
    Starting test.concurrent.test.TestThree:four

TestOne > four() STANDARD_OUT
    Done test.concurrent.test.TestSameTwo:one
    Starting test.concurrent.test.TestOne:four

TestSameTwo > two() STANDARD_OUT
    Starting test.concurrent.test.TestSameTwo:two
    Done test.concurrent.test.TestTwo:four
    Done test.concurrent.test.TestThree:four

TestThree STANDARD_OUT
    Done test.concurrent.test.TestOne:four

TestThree > three() STANDARD_OUT
    Starting test.concurrent.test.TestTwo:three
    Starting test.concurrent.test.TestThree:three

TestOne > three() STANDARD_OUT
    Starting test.concurrent.test.TestOne:three
    Done test.concurrent.test.TestSameTwo:two

TestSameTwo > three() STANDARD_OUT
    Starting test.concurrent.test.TestSameTwo:three
    Done test.concurrent.test.TestTwo:three
    Done test.concurrent.test.TestThree:three

Gradle Test Executor 8 STANDARD_OUT
    Done test.concurrent.test.TestOne:three
    Done test.concurrent.test.TestSameTwo:three

TestIsonTwo > one() STANDARD_OUT
    Starting test.concurrent.test.TestIsonTwo:one
    Done test.concurrent.test.TestIsonTwo:one

TestIsonTwo > two() STANDARD_OUT
    Starting test.concurrent.test.TestIsonTwo:two
    Done test.concurrent.test.TestIsonTwo:two

TestIsonTwo > three() STANDARD_OUT
    Starting test.concurrent.test.TestIsonTwo:three
    Done test.concurrent.test.TestIsonTwo:three

```