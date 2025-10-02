package com.example.profilapp_235150207111024dustin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profilapp_235150207111024dustin.ui.theme.ProfilApp_235150207111024DustinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfilApp_235150207111024DustinTheme {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    ProfileSection()
                }
            }
        }
    }
}

@Composable
fun ProfileSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color(0xFFE0F7FA))
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.profil),
            contentDescription = "Foto Profil",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(12.dp))

        Text("Nama: M. Dustin Hazeldo T.", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(4.dp))

        Text("Mahasiswa Teknik Informatika")
        Spacer(modifier = Modifier.height(16.dp))

        FollowButton()
    }
}

@Composable
fun FollowButton() {
    var isFollowed by remember { mutableStateOf(false) }
    Button(onClick = { isFollowed = !isFollowed }) {
        Text(if (isFollowed) "Unfollow" else "Follow")
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
    ProfilApp_235150207111024DustinTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            ProfileSection()
        }
    }
}