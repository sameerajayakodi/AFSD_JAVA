<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fashion Store | Home</title>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/js/all.min.js"></script>
    <script src="https://cdn.tailwindcss.com"></script>
    <style>
        .glass {
            background: rgba(255, 255, 255, 0.1);
            backdrop-filter: blur(10px);
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1), 0 1px 3px rgba(0, 0, 0, 0.06);
        }
    </style>
</head>
<body class="font-sans bg-gray-900 text-white">
<header class="fixed w-full glass z-50">
    <div class="bg-gray-800 bg-opacity-50 py-2 text-center">
        <p>Free shipping on orders over $100!</p>
    </div>
    <nav class="max-w-7xl mx-auto px-4 py-4 flex justify-between items-center">
        <a href="#" class="text-2xl font-bold text-white">FASHION STORE</a>
        <div class="flex gap-8 items-center">
            <a href="#" class="hover:text-blue-400 transition-colors">Home</a>
            <a href="#" class="hover:text-blue-400 transition-colors">Shop</a>
            <a href="#" class="hover:text-blue-400 transition-colors">Categories</a>
            <a href="#" class="hover:text-blue-400 transition-colors">About</a>
            <a href="#" class="hover:text-blue-400 transition-colors">Contact</a>
            <a href="#" class="hover:text-blue-400 transition-colors"><i class="fas fa-shopping-cart"></i></a>
            <a href="#" class="hover:text-blue-400 transition-colors"><i class="fas fa-user"></i></a>
        </div>
    </nav>
</header>

<section class="pt-24 relative h-[600px] bg-gradient-to-r from-gray-800 to-gray-700 flex items-center">
    <div class="max-w-7xl mx-auto px-4 relative z-10">
        <h1 class="text-5xl font-bold mb-4">Summer Collection 2025</h1>
        <p class="text-xl mb-8">Discover the latest trends in fashion</p>
        <a href="#" class="inline-block px-8 py-4 bg-blue-600 text-white rounded-lg hover:bg-blue-700 transition-colors">Shop Now</a>
    </div>
</section>

<section class="max-w-7xl mx-auto px-4 py-16">
    <h2 class="text-3xl font-bold text-center mb-12">Shop by Category</h2>
    <div class="grid grid-cols-1 md:grid-cols-3 gap-8">
        <div class="relative h-[300px] rounded-lg overflow-hidden glass group">
            <div class="absolute inset-0 flex items-end p-6">
                <h3 class="text-2xl font-bold text-white group-hover:scale-110 transition-transform">Men's Fashion</h3>
            </div>
        </div>
        <div class="relative h-[300px] rounded-lg overflow-hidden glass group">
            <div class="absolute inset-0 flex items-end p-6">
                <h3 class="text-2xl font-bold text-white group-hover:scale-110 transition-transform">Women's Fashion</h3>
            </div>
        </div>
        <div class="relative h-[300px] rounded-lg overflow-hidden glass group">
            <div class="absolute inset-0 flex items-end p-6">
                <h3 class="text-2xl font-bold text-white group-hover:scale-110 transition-transform">Accessories</h3>
            </div>
        </div>
    </div>
</section>

<section class="max-w-7xl mx-auto px-4 py-16">
    <h2 class="text-3xl font-bold text-center mb-12">Featured Products</h2>
    <div class="grid grid-cols-1 md:grid-cols-4 gap-8">
        <div class="glass rounded-lg overflow-hidden transition-transform hover:-translate-y-1">
            <div class="h-[300px] bg-gradient-to-br from-yellow-400 to-orange-500"></div>
            <div class="p-4">
                <h3 class="font-bold mb-2">Casual T-Shirt</h3>
                <p class="text-gray-300 mb-2">Comfortable cotton blend</p>
                <span class="text-blue-400 font-bold text-lg">$29.99</span>
            </div>
        </div>
        <div class="glass rounded-lg overflow-hidden transition-transform hover:-translate-y-1">
            <div class="h-[300px] bg-gradient-to-br from-blue-400 to-indigo-500"></div>
            <div class="p-4">
                <h3 class="font-bold mb-2">Denim Jacket</h3>
                <p class="text-gray-300 mb-2">Classic style</p>
                <span class="text-blue-400 font-bold text-lg">$89.99</span>
            </div>
        </div>
        <div class="glass rounded-lg overflow-hidden transition-transform hover:-translate-y-1">
            <div class="h-[300px] bg-gradient-to-br from-pink-400 to-rose-500"></div>
            <div class="p-4">
                <h3 class="font-bold mb-2">Summer Dress</h3>
                <p class="text-gray-300 mb-2">Light and flowy</p>
                <span class="text-blue-400 font-bold text-lg">$59.99</span>
            </div>
        </div>
        <div class="glass rounded-lg overflow-hidden transition-transform hover:-translate-y-1">
            <div class="h-[300px] bg-gradient-to-br from-teal-400 to-emerald-500"></div>
            <div class="p-4">
                <h3 class="font-bold mb-2">Sneakers</h3>
                <p class="text-gray-300 mb-2">Urban style</p>
                <span class="text-blue-400 font-bold text-lg">$79.99</span>
            </div>
        </div>
    </div>
</section>

<footer class="bg-gray-800 text-white py-16">
    <div class="max-w-7xl mx-auto px-4 grid grid-cols-1 md:grid-cols-4 gap-12">
        <div>
            <h3 class="text-xl font-bold mb-4">About Us</h3>
            <p class="mb-6">Fashion Store is your one-stop destination for trendy and stylish clothing.</p>
            <div class="flex gap-4">
                <a href="#" class="text-2xl hover:text-blue-400"><i class="fab fa-facebook"></i></a>
                <a href="#" class="text-2xl hover:text-blue-400"><i class="fab fa-instagram"></i></a>
                <a href="#" class="text-2xl hover:text-blue-400"><i class="fab fa-twitter"></i></a>
                <a href="#" class="text-2xl hover:text-blue-400"><i class="fab fa-pinterest"></i></a>
            </div>
        </div>
        <div>
            <h3 class="text-xl font-bold mb-4">Quick Links</h3>
            <ul class="space-y-2">
                <li><a href="#" class="hover:text-blue-400">Shop</a></li>
                <li><a href="#" class="hover:text-blue-400">Categories</a></li>
                <li><a href="#" class="hover:text-blue-400">About Us</a></li>
                <li><a href="#" class="hover:text-blue-400">Contact</a></li>
            </ul>
        </div>
        <div>
            <h3 class="text-xl font-bold mb-4">Customer Service</h3>
            <ul class="space-y-2">
                <li><a href="#" class="hover:text-blue-400">Shipping Information</a></li>
                <li><a href="#" class="hover:text-blue-400">Returns & Exchanges</a></li>
                <li><a href="#" class="hover:text-blue-400">Size Guide</a></li>
                <li><a href="#" class="hover:text-blue-400">FAQ</a></li>
            </ul>
        </div>
        <div>
            <h3 class="text-xl font-bold mb-4">Newsletter</h3>
            <p class="mb-4">Subscribe to receive updates, access to exclusive deals, and more.</p>
            <form action="newsletter-signup" method="POST" class="space-y-4">
                <input type="email" name="email" placeholder="Enter your email" required class="w-full px-4 py-2 rounded-lg text-gray-800">
                <button type="submit" class="w-full px-4 py-2 bg-blue-600 rounded-lg hover:bg-blue-700 transition-colors">Subscribe</button>
            </form>
        </div>
    </div>
</footer>
</body>
</html>
