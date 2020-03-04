package com.paxees

public interface ResponseListner {
    fun isSuccess()
    fun isFailure()
    fun validationError()
    fun onClick(viewID:Int)
}