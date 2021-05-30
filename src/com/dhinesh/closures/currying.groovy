package com.dhinesh.closures

def log = {String type, Date createdOn, String msg ->
println("$createdOn [$type] - $msg")
}

log("DEBUG", new Date(), "This is debug message")

def debugLog = log.curry("DEBUG")

debugLog(new Date(), "This is from curry")

def todayDebugLog = log.curry("DEBUG", new Date())
todayDebugLog("This is from another form of cusrry")


//right curry

def crazyPersonLog = log.rcurry("Why i am logging this way")
crazyPersonLog("INFO", new Date())

// index based currying
def typeMsgLog = log.ncurry(1,new Date())
typeMsgLog("ERROR","This is using ncurry...")