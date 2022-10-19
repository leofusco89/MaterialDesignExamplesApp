package com.example.materialdesignexamples

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class ToolbarNavigationViewActivity : AppCompatActivity() {

    private lateinit var navigationView: NavigationView
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar_navigation_view)

        configurarToolbar()
        configurarNavigationView()
    }

    private fun configurarNavigationView() {

        navigationView = findViewById(R.id.navigationView)

        navigationView.menu.add("abc")

        drawerLayout = findViewById(R.id.drawerLayout)
        val drawerToggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()
        navigationView.setNavigationItemSelectedListener {
//            when (it.itemId) {
//                R.id.menuIrA -> irA() //Implementar
//                R.id.menuSalir -> finish()
//            }
            when (it.title) {
                "Salir" -> Toast.makeText(this, "abc opcion", Toast.LENGTH_SHORT).show()
                "abc" -> Toast.makeText(this, "abc opcion", Toast.LENGTH_SHORT).show()
            }
            drawerLayout.closeDrawers()
            true
        }
    }

    private fun configurarToolbar() {
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun irA() {
        //TODO Implementar
    }

}
