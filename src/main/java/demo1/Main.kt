package demo1

import org.intellij.lang.annotations.Language
import java.io.File

/**
 *  @author      : yan
 *  @date        : 2018/2/4 23:13
 *  @description : TODO
 */
fun main(args: Array<String>) {
//    println(plus1(10)(20))
//    println(plus2(10)(20))
    val reg = Regex("0[xX]")
}

fun test1(block: () -> Unit) {
    block()
}

inline fun test2(block: () -> Unit) {
    block()
}

fun test(): Int {
    test1 {
        println("test1")
        return@test1
    }
    test2 {
        println("test2")
        return 2
    }
    return 0
}

fun plus1(a: Int) = { b: Int -> a + b }

fun plus2(a: Int) = a::add

fun Int.add(b: Int) = this + b

fun test3() {
    println(plus2(10)(20))
}

fun applyToFile(block: File.() -> Unit) {
    val file = File("")
    file.block()
    block(file)
}

/*
import java.util.Random;class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int a = 233;
        a = new Random().nextInt();
        System.out.println(a);
    }
}
 */
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Hello World")
    }
}

