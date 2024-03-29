package com.tjoeun.a20191201_01_kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Ctrl+/ 주석
//        버튼이 (okBtn)눌리면
//        EditText (inputEdt) 에 적힌 값(text)을 받아서
//        TextView의 (resultTxt)내용(text)으로 반영.

        okBtn.setOnClickListener {
//Ctrl+K 커밋

            var inputString = inputEdt.text.toString()  // get=> 내용을 받아오기.
            resultTxt.text = inputString // set = > 내용물 설정하기

//            확인 버튼이 눌렸는지 로그
            Log.d("확인버튼클릭",inputString)

//            if (inputString=="Hello"){
//                Toast.makeText(this,"환영인사",Toast.LENGTH_SHORT).show()
//            }
//            else if (inputString=="bye"){
//                Toast.makeText(this,"작별인사",Toast.LENGTH_SHORT).show()
//            }
//            else{
//                Toast.makeText(this, "기타문장", Toast.LENGTH_SHORT).show()
//            }

            when(inputString){
                "hello"->{
                    Toast.makeText(this,"환영인사",Toast.LENGTH_SHORT).show()
                    Log.d("when연습","환영인사인 경우")
                }
                "bye"->Toast.makeText(this,"작별인사",Toast.LENGTH_SHORT).show()
                else->Toast.makeText(this, "기타문장", Toast.LENGTH_SHORT).show()
            }
//
//            val year = 1988
//
//            val age= when(year){
//                1988->32
//                in 1991..2000 ->20
//                else -> -1
//            }

      }

        okBtn.setOnLongClickListener {

            resultTxt.text ="초기 상태"

            Log.d("확인버튼롱클릭","텍스트뷰 초기화")

            return@setOnLongClickListener true // true는 onclicklistener 무시할건가
        }

    }
}
