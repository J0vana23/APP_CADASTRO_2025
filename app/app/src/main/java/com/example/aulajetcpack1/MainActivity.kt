package com.example.aulajetcpack1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aulajetcpack1.ui.theme.AulaJetcPack1Theme
import com.example.aulajetcpack1.ui.theme.Minhacor
import com.example.aulajetcpack1.ui.theme.Purple40
import com.example.aulajetcpack1.ui.theme.Purple500

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AulaJetcPack1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->



                    ProdutoItem() //função no lugar de greeting

                }
            }
        }
    }
}


@Preview (showBackground = true)
@Composable

//usando a funçao
fun ProdutoItem(){
    Column(
        Modifier
            .height(250.dp)
            .width(200.dp)
    )
    {
        Box(
            modifier=Modifier
                .height(100.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Purple500, Minhacor, Purple40
                        )
                    )
                )
                .fillMaxWidth()
        )
        {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription= "Descrição da imagem",
                modifier = Modifier
                    .offset(y= (50).dp)
                    .clip(shape = CircleShape)
                    .align(Alignment.BottomCenter)
            )
        }
        Spacer(modifier= Modifier.height(50.dp))
    }
}
