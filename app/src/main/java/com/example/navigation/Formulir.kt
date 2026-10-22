package com.example.navigation

@OptIn(markerClass = ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK: List<String> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    Scaffold (modifier=Modifier)
    topBar= {
        TopAppBar(
            title = {Text(stringResource(id = R.string.home), color = Color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(
                containerColor = colorResource(id = R.color.teal_700))
        )
    }
    Column(modifier = Modifier.padding(paddingValues = isiRuang),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        // Ruang untuk form input
    }
}