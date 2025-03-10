package com.example.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack.ui.theme.Black1
import com.example.jetpack.ui.theme.Grey1
import com.example.jetpack.ui.theme.JetPackTheme
import com.example.jetpack.ui.theme.White1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackTheme {
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

    //VARIÁVEIS DE TEXFIELD
    var nome by remember { mutableStateOf("") }
    var telefone by remember { mutableStateOf("") }
    var curso by remember { mutableStateOf("") }
    var serie by remember { mutableStateOf("") }

    Column(
        Modifier
            .height(450.dp)
            .width(200.dp)
            .background(color = androidx.compose.ui.graphics.Color.Black), // Fundo preto na coluna
        horizontalAlignment = Alignment.CenterHorizontally // Centraliza o conteúdo horizontalmente

    )
    {
        Box(
            modifier=Modifier
                .height(80.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Black1, Grey1, White1, Grey1, Black1
                        )
                    )
                )
                .fillMaxWidth()
        )
        {
            Image(
                painter = painterResource(id = R.drawable.github),
                contentDescription= "Descrição da imagem",
                modifier = Modifier
                    .offset(y= (30).dp)
                    .clip(shape = CircleShape)
                    .align(Alignment.BottomCenter)
            )
        }
        Spacer(modifier= Modifier.height(40.dp))

        // Título
        Text(
            text = "INSCREVA-SE",
            style = androidx.compose.material3.MaterialTheme.typography.titleLarge.copy(color = Color.White),
            modifier = Modifier.fillMaxWidth(),
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            textAlign = TextAlign.Center


        )


        Spacer(modifier = Modifier.height(2.dp))

        // Subtítulo
        Text(
            text = "~ Digite as informações abaixo: ~",
            style = androidx.compose.material3.MaterialTheme.typography.titleLarge.copy(color = Color.White),
            modifier = Modifier.fillMaxWidth(),
            fontWeight = FontWeight.Bold,
            fontSize = 10.sp,
            textAlign = TextAlign.Center


        )

        Spacer(modifier = Modifier.height(0.dp))

        Row(
            Modifier.padding(5.dp)
        ) {
            OutlinedTextField(
                value = nome,
                onValueChange = { nome = it },
                label = {
                    Text(
                        "NOME:",
                        color = Color.White,
                        style = TextStyle(fontSize = 10.sp) // Ajuste o tamanho da fonte
                    )
                },
                modifier = Modifier
                    .height(40.dp)
                    .width(180.dp)
                    .padding(2.dp)
            )
        }

        Row(
            Modifier.padding(5.dp)
        ) {
            OutlinedTextField(
                value = telefone,
                onValueChange = { telefone = it },
                label = {
                    Text(
                        "TELEFONE:",
                        color = Color.White,
                        style = TextStyle(fontSize = 10.sp) // Ajuste o tamanho da fonte
                    )
                },
                modifier = Modifier
                    .height(40.dp)
                    .width(180.dp)
                    .padding(2.dp)
            )
        }

        Row(
            Modifier.padding(5.dp)
        ) {
            OutlinedTextField(
                value = curso,
                onValueChange = { curso = it },
                label = {
                    Text(
                        "CURSO:",
                        color = Color.White,
                        style = TextStyle(fontSize = 10.sp) // Ajuste o tamanho da fonte
                    )
                },
                modifier = Modifier
                    .height(40.dp)
                    .width(180.dp)
                    .padding(2.dp)
            )
        }

        Row(
            Modifier.padding(5.dp)
        ) {
            OutlinedTextField(
                value = serie,
                onValueChange = { serie = it },
                label = {
                    Text(
                        "SÉRIE:",
                        color = Color.White,
                        style = TextStyle(fontSize = 10.sp) // Ajuste o tamanho da fonte
                    )
                },
                modifier = Modifier
                    .height(40.dp)
                    .width(180.dp)
                    .padding(2.dp)

            )
        }

        Spacer(modifier = Modifier.height(5.dp))

        Row(
            Modifier.padding(5.dp)
        ) {
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(3.dp)
                    .height(35.dp) // Define a altura do botão
                    .width(90.dp), // Define a largura do botão
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                )
            ) {
                Text(
                    text = "ENVIAR",
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(fontSize = 10.sp) // Ajusta o tamanho da fonte
                )
            }
        }

    }
}