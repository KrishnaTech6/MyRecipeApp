package com.example.myrecipeapp

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberAsyncImagePainter

@Composable
fun RecipeScreen(modifier: Modifier= Modifier){
    val recipeViewModel : MainViewModel = viewModel()

    val recipeState by recipeViewModel.categoryState
    
    
    Box(modifier = Modifier.fillMaxSize()) {
        when{
            recipeState.loading -> {
                CircularProgressIndicator(modifier.align(Alignment.Center))
            }
            recipeState.error != null -> {
                Text(text = "Some Error Occurred")
            }
            else->{
                CategoryScreen(categories = recipeState.list)
            }
        }
    }



}

@Composable
fun CategoryScreen(categories: List<Category>){
    LazyVerticalGrid(GridCells.Fixed(2), modifier = Modifier.fillMaxSize()){
        items(categories){
            category ->
            CategoryItem(category = category)
        }
    }


}

@Composable
fun CategoryItem(category: Category){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(8.dp),
    horizontalAlignment = Alignment.CenterHorizontally) {

        Image(painter = rememberAsyncImagePainter(category.strCategoryThumb),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .aspectRatio(1f)
        )

        Text(
            text = category.strCategory,
            color = Color.Black,
            style = TextStyle(fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(top = 4.dp)
        )

    }
}