def solution(nums):
    num_uniq = list(set(nums))
    mount = int(len(nums)/2)
    
    return mount if int(len(num_uniq)) >= mount else int(len(num_uniq))