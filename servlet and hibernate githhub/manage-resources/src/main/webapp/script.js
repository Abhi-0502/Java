document.getElementById('openGallery').addEventListener('click', function (e) {
    e.preventDefault(); // Prevent the default link behavior
    const galleryWindow = window.open('', '_blank'); // Open a new window
    galleryWindow.document.write(`
        <html>
            <head>
                <title>Nature Images</title>
                <style>
                    body {
                        font-family: Arial, sans-serif;
                        text-align: center;
                        padding: 20px;
                    }
                    .gallery-content {
                        display: flex;
                        flex-wrap: wrap;
                        justify-content: center;
                        gap: 10px;
                        padding: 20px;
                    }
                    .gallery-content img {
                        width: 150px;
                        height: 150px;
                        border-radius: 8px;
                        object-fit: cover;
                    }
                </style>
            </head>
            <body>
                <h2>Nature Images</h2>
                <div class="gallery-content">
                <a href = "OIP.jpeg">hi</a>
                     <a href = "R.jpeg">dog</a>
                     <a href = "rose.jpeg">Rose</a>
                     <a href = "d.jpg">d</a>
                     <a href = "img.jpg">nature</a>
                     <a href = "img1.jpg">img1</a>
                        <a href = "t.jpg">t</a>
                         <a href = "phone.jpg">phone</a>
                         <a href = "butterfly.jpg">Butterfly</a>
                          <a href = "shiva.jpg">shiva</a>
                           <a href = "pngtree.jpg">pngtree</a>
                            <a href = "nature1.jpg">nature1</a>
                              </div>
                                        </body>
                                    </html>
                                `);
                                galleryWindow.document.close();
                            });
