package com.example.wikipedia

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.example.wikipedia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        setSupportActionBar(binding.toolbarmain)


        val drawerActionToggle = ActionBarDrawerToggle(
            this,
            binding.drawermain,
            binding.toolbarmain,
            R.string.closeDrawer,
            R.string.openDrawer
        )

        binding.drawermain.addDrawerListener(drawerActionToggle)

        drawerActionToggle.syncState()


        binding.navigationdrawer.setNavigationItemSelectedListener {

            when (it.itemId) {

                R.id.writer_menu -> {



                        replaceFragment(FragmentWriter())
                        binding.drawermain.closeDrawer(GravityCompat.START)
                    }
















                R.id.translator_menu -> {


                  replaceFragment(FragmentTranslator())

                  binding.drawermain.closeDrawer(GravityCompat.START)



                }
                R.id.photographer_menu -> {

replaceFragment(FragmentPhotographer())

                    binding.drawermain.closeDrawer(GravityCompat.START)




                }
                R.id.videomaker_menu -> {

replaceFragment(FragmentVideoMaker())

                    binding.drawermain.closeDrawer(GravityCompat.START)



                }
                R.id.wikipedia_menu -> {

                    val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wikipedia.org/"))
startActivity(intent)
binding.drawermain.closeDrawer(GravityCompat.START)
                }
                R.id.wikimedia_menu -> {


                    val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wikimedia.org/"))
                    startActivity(intent)

                    binding.drawermain.closeDrawer(GravityCompat.START)

                }

            }








            true
        }

        firstRun()


        binding.bottomnavigationmain.setOnItemSelectedListener {

            when (it.itemId) {

                R.id.explore_bottomnavigation -> {

                    replaceFragment(FragmentExplore())


                }


                R.id.trend_bottomnavigation -> {

                    replaceFragment(FragmentTrend())


                }

                R.id.profile_bottomnavigation -> {

                    replaceFragment(FragmentProfile())





                }







            }





            true
        }





        binding.bottomnavigationmain.setOnItemReselectedListener { }


    }

    fun replaceFragment(fragment: Fragment) {


        val transAction = supportFragmentManager.beginTransaction()
        transAction.replace(R.id.framemain, fragment)
        transAction.addToBackStack(null)
        transAction.commit()


    }


    fun firstRun() {

        replaceFragment(FragmentExplore())

        binding.bottomnavigationmain.selectedItemId = R.id.explore_bottomnavigation


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_off,menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {


        when(item.itemId){

            R.id.btnexit->{



                onBackPressed()
            }


        }

        return true
    }




}