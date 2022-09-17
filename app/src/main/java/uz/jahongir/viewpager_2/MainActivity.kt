package uz.jahongir.viewpager_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator
import uz.jahongir.viewpager_2.adapters.FragmentPagerAdapter
import uz.jahongir.viewpager_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var fragmentPagerAdapter: FragmentPagerAdapter

    private var index = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        User.addList()

        fragmentPagerAdapter = FragmentPagerAdapter(this, User.list)
        binding.myViewPager2.adapter = fragmentPagerAdapter

        binding.next.setOnClickListener {
            binding.myViewPager2.apply {
                beginFakeDrag()
                fakeDragBy(-10f)
                endFakeDrag()
            }
        }


//        val springDotsIndicator = findViewById<SpringDotsIndicator>(R.id.spring_dots_indicator)
//        val viewPager = findViewById<ViewPager>(R.id.view_pager)
//        val adapter = ViewPagerAdapter()
//        viewPager.adapter = adapter
//        springDotsIndicator.attachTo(viewPager)

        val springDotsIndicator = findViewById<SpringDotsIndicator>(R.id.dots_indicator)
        val viewPager = binding.myViewPager2
        val adapter = FragmentPagerAdapter(this, User.list)
        viewPager.adapter = adapter
        springDotsIndicator.attachTo(viewPager)

        binding.skip.setOnClickListener {
            when (index) {
                0 -> {
                    binding.myViewPager2.currentItem = index + 4
                }
                1 -> {
                    binding.myViewPager2.currentItem = index + 4
                }
                2 -> {
                    binding.myViewPager2.currentItem = index + 4
                }
                3 -> {
                    binding.myViewPager2.currentItem = index + 4

                    binding.next.visibility = View.GONE
                }
            }
        }
    }
}