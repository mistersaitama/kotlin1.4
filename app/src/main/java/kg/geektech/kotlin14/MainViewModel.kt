package kg.geektech.kotlin14

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var mCounter = 0
    var counter = MutableLiveData<Int>()
    var commands = MutableLiveData<ArrayList<String>>()
    var plus: String = "+"
    var minus: String = "-"

    fun onIncrementClick (){
        counter.value = ++mCounter
    }
    fun onDecrementClick () {
        counter.value = --mCounter
    }
    fun setCommands (history: ArrayList<String>){
        commands.value = history
    }
}