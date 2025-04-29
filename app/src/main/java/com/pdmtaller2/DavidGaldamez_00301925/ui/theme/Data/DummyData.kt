package com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Data

val restaurants = listOf<Restaurant>(
    Restaurant(
       id = 1,
        name = "Pastaria",
        description = "Comida italiana!",
        imageUrl = "https://scontent.fsal13-1.fna.fbcdn.net/v/t39.30808-6/398666482_637062905249296_7615515134051142764_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=6ee11a&_nc_ohc=SSDBlsRSXaMQ7kNvwEzQH7R&_nc_oc=AdnfQ9jy8ITdz2D05sJ26oeLrql4S8leczJb2PfQfV16h60s4k0iHcN7wdqmGqOFAtE&_nc_zt=23&_nc_ht=scontent.fsal13-1.fna&_nc_gid=Hhtw9k8kWQfsdlnIAduvQg&oh=00_AfG5ANwGUr6RS6lILjx9FIK5JBA9MO14Kge-I2_pZVwygQ&oe=6816D2F0",
        categories = listOf("Italiana"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Pizza Napolitana",
                description = "Pizza Clasica",
                imageUrl = "https://imgs.search.brave.com/iXoOEirm8JL6ICd4gux3PRO5jIb79CK2V3Ncqi2aWlg/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9jb2xl/eWNvb2tzLmNvbS93/cC1jb250ZW50L3Vw/bG9hZHMvMjAyNC8w/MS9uZWFwb2xpdGFu/LXBpenphLWRvdWdo/LTI1LmpwZw",
            ),
            Dish(
                id = 2,
                name = "Pasta Carbonara",
                description = "Pasta clasica",
                imageUrl = "https://imgs.search.brave.com/sABPDi_oNXhtmwLZpFFvmUEr2TDRtkAN_JZtol-URyY/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly90NC5m/dGNkbi5uZXQvanBn/LzAyLzMyLzUyLzI3/LzM2MF9GXzIzMjUy/MjczNV9MeUhOWVFH/NlVpTjBkaXFUcGlZ/Nk8xaGRFZWx4Mlg5/RC5qcGc",
            )
        )
    ),
    Restaurant(
        id = 2,
        name = "Pizza hut",
        description = "Rico restaurante de pizzas y demas comidas!",
        imageUrl = "https://imgs.search.brave.com/dGXB0h06-yIz2GcCTI3Ruif3xkbkekUtLxIlhHDENRg/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly90Yi1z/dGF0aWMudWJlci5j/b20vcHJvZC9pbWFn/ZS1wcm9jL3Byb2Nl/c3NlZF9pbWFnZXMv/NWIyY2RkYjUyNjAz/MWYxYjI1MTYwZGM2/MDdmYmZkNWQvMDI5/ZTZmNGUwYzgxYzE0/NTcyMTI2MTA5ZGZl/ODY3ZjMuanBlZw",
        categories = listOf("Rapida", "Postres"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Pizza pepperoni",
                description = "Pizza clasica de pepperoni",
                imageUrl = "https://imgs.search.brave.com/JyyWkq7FSXZP0MUifh-xO5rvSx_e8RbYOGDj2dFBX5s/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9tZWRp/YS5pc3RvY2twaG90/by5jb20vaWQvMTg0/OTI4NDMyL3Bob3Rv/L3BpenphLWZyb20t/dGhlLXRvcC1wZXBw/ZXJvbmktY2hlZXNl/LmpwZz9zPTYxMng2/MTImdz0wJms9MjAm/Yz13a0M0eXJaTGN2/SHFnLTlrUXRSYjF3/YW5fejE1ZWlPMVoy/OTdPRlN1eHBnPQ",
            ),
            Dish(
                id = 2,
                name = "Pizza super suprema",
                description = "Pizza gigante super suprema",
                imageUrl = "https://imgs.search.brave.com/bRnmJb6SFOPbTAR9sllqfFqj52a8PRwAuL52PuTkn2M/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9zdGF0/aWMud2l4c3RhdGlj/LmNvbS9tZWRpYS83/OWRmODNfZjEwMzMz/Y2FkODlkNDIyYjg0/NzYxOGFjNjllZDFj/YjR-bXYyLmpwZy92/MS9maWxsL3dfNjAw/LGhfNDAwLGFsX2Ms/cV84MCxlbmNfYXZp/ZixxdWFsaXR5X2F1/dG8vSkFNT04tWS1E/VVJBWk5PLW1pbi5q/cGc",
            )
        )
    ),
    Restaurant(
        id = 3,
        name = "Donkeys",
        description = "Rica comida mexicana",
        imageUrl = "https://imgs.search.brave.com/GIi491uIaishQap9At7xPAdXrtVT6VBXCayPFy8O3gE/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly90Yi1z/dGF0aWMudWJlci5j/b20vcHJvZC9pbWFn/ZS1wcm9jL3Byb2Nl/c3NlZF9pbWFnZXMv/ZjUyMDk3YTgyN2U4/MDUxYTBlNTRhMzU2/YTYxYmEyMDkvNGYz/ZjYyZjNmNWI2OTMy/MjYzZTdmMjc5MjNm/OTNiMmQucG5n",
        categories = listOf("Mexicana", "Postres"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Tacos de birria",
                description = "Ricos tacos de birria con su caldo de consome",
                imageUrl = "https://imgs.search.brave.com/W-kLdxzA_DGDYYtlx0w8OkLQSngPhnF1MyHCtSRcKhw/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9sYXVy/ZW5zbGF0ZXN0LmNv/bS93cC1jb250ZW50/L3VwbG9hZHMvMjAy/Mi8wNC9iaXJyaWEt/dGFjb3MtMDYuanBn",
            ),
            Dish(
                id = 2,
                name = "Brownie",
                description = "Postre de brownie",
                imageUrl = "https://imgs.search.brave.com/yqndDb7ntLUN3uf9V5ySKzvByhCRfk9R6lhTNc5T1-0/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly93aGlz/a2Z1bGx5c28uY29t/L3dwLWNvbnRlbnQv/dXBsb2Fkcy8yMDIx/LzA1L0Jyb3duaWVz/LTgtODE5eDEwMjQu/anBn",
            )
        )
    ),
)