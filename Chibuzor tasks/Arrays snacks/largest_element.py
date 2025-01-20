def largest_of(numbers[]):
	largest = numbers[0]
	for index in numbers:
		if numbers[index] > largest:
			largest = numbers[index]
	return largest


arr_values = {1,2,3,4,5,6,7}
result = largest_of(arr_values)
print(result)