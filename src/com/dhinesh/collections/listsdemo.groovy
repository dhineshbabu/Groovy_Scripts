package com.dhinesh.collections

def nums = [1,2,3,4,5,6,78,7,7,8,8,5,6]
println(nums)
println(nums.class)


def nums2 = [1,2,3,4,5,6,78,7,7,8,8,5,6] as LinkedList

nums.push(99)
println(nums)
nums.putAt(0,77)
println(nums)
println(nums + [3,4,6]) // original list wont be affected
println(nums)
nums << 66 // will add element to the list
println(nums)
nums.pop()
println(nums)
nums.removeAt(0)
println(nums)
println(nums - 99)
println(nums[4])
println(nums.getAt(2..4))

//println(nums.clear()) // or nums = []

for(x in nums){
    println(x)
}

nums << [3,4,5]
println(nums)
println(nums.flatten())
println(nums.unique())

def numbers = [1,2,3,4,5,6,6,7,87,8,89,8,5] as Set
println(numbers) // set wil remove duplicates

