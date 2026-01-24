def findMinMax(arr):
    smallest = arr[0]
    largest = arr[0]

    for num in arr:
        if num < smallest:
            smallest = num
        if num > largest:
            largest = num

    return smallest, largest

#O(n)  ---time complexity
#O(1)  ---space complexity