package br.senai.sp.jandira.abcdown_mobile.components

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.abcdown_mobile.R
import br.senai.sp.jandira.abcdown_mobile.gui.studentArea.StudentAreaScreen
import br.senai.sp.jandira.abcdown_mobile.ui.theme.ABCDown_mobileTheme
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@Composable
fun CardStudent (
    navController: NavController,
    photo: Int,
    name: String,
    dateOfBirth: String,
    gender: String,
    onClick: (NavController) -> Unit,
    ){
    
    Card(
       modifier = androidx.compose.ui.Modifier
           .fillMaxWidth()
           .height(170.dp)

    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(colorResource(id = R.color.blue))
                .padding(20.dp, 20.dp)

        ) {
            Card(
                modifier = Modifier
                    .size(130.dp),
                shape = CircleShape,
                border = BorderStroke(1.5.dp, Color.White)


            ){
                Image(
                    painter = painterResource(id = photo),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(130.dp)
                        .clip(CircleShape)
                        .border(width = 2.dp, Color.White),
                )
            }
            
            Spacer(modifier = Modifier.width(20.dp))


            Column (
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {

                Column(
                    modifier = Modifier.padding(top= 10.dp)
                ) {
                    Text(
                        text = name,
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.calendar_24),
                            contentDescription = "icon calendar",
                            modifier = Modifier.size(18.dp),
                            colorFilter = ColorFilter.tint(colorResource(id = R.color.blue_card_student))
                        )

                        Spacer(modifier = Modifier.width(3.dp))

                        Text(
                            text = dateOfBirth,
                            color = colorResource(id = R.color.blue_card_student),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium
                        )

                    }

                    Spacer(modifier = Modifier.height(5.dp))

                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.gender),
                            contentDescription = "icon gender",
                            modifier = Modifier.size(18.dp),

                            )

                        Spacer(modifier = Modifier.width(3.dp))

                        Text(
                            text = gender,
                            color = colorResource(id = R.color.blue_card_student),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium
                        )

                    }
                }



                Button(
                    onClick = { onClick(navController) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(35.dp),
                    colors = ButtonDefaults.buttonColors(Color.White),
                    shape = RoundedCornerShape(8.dp),
                ){
                    Text(
                        text = stringResource(id = R.string.accompany).uppercase(),
                        fontSize = 13.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = colorResource(id = R.color.blue)
                    )
                }


            }
        }

        
    }

}

@OptIn(ExperimentalAnimationApi::class)
@Preview()
@Composable
fun StudentAreaPreview() {
    val navController = rememberAnimatedNavController()
    ABCDown_mobileTheme {
        StudentAreaScreen(navController = navController)
    }
}