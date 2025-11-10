// MathOps.c
#include <jni.h>
#include "MathOps.h"

JNIEXPORT jint JNICALL Java_MathOps_add(JNIEnv *env, jobject obj, jint a, jint b) {
    return a + b;
}
