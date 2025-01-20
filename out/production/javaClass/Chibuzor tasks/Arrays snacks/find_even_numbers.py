def find_even_numbers(arrays):
	for index in arrays:
		if index % 2 == 0:
			print(index)
even_arrays = {1,2,3,3,4,5,6,6,7,7,8,7,6,5}
find_even_numbers(even_arrays)