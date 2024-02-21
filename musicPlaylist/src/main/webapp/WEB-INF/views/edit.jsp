<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Edit | ${song.name}</title>

        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                margin: 0;
                padding: 0;
                display: flex;
                align-items: center;
                justify-content: center;
                height: 100vh;
            }

            form {
                background-color: #fff;
                padding: 20px;
                border-radius: 8px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                width: 300px;
            }

            label {
                display: block;
                margin-bottom: 8px;
                font-weight: bold;
            }

            input {
                width: 100%;
                padding: 8px;
                margin-bottom: 16px;
                box-sizing: border-box;
                border: 1px solid #ccc;
                border-radius: 4px;
            }

            button {
                background-color: #4caf50;
                color: #fff;
                padding: 10px;
                border: none;
                border-radius: 4px;
                margin: 5px 5px;
                cursor: pointer;
                width: 100%;
            }

            button:hover {
                background-color: #45a049;
            }
        </style>
    </head>

    <body>
        <form action="/addSong" method="post">
            <div class="modal-header">
                <h4 class="modal-title">Edit Song</h4>

            </div>
            <div class="modal-body">
                <input type="hidden" name="musicId" id="musicId" value="${song.musicId}" />
                <div class="form-group">
                    <label>Name</label> <input type="text" class="form-control" name="name" value="${song.name}"
                        required>
                </div>
                <div class="form-group">
                    <label>Genre</label> <input type="text" class="form-control" name="genre" value="${song.genre}"
                        required>
                </div>
                <div class="form-group">
                    <label>Singer</label> <input type="text" class="form-control" name="singer" value="${song.singer}"
                        required>
                </div>

            </div>
            <div class="modal-footer">
                <a href="."><button type="button" class="close btn btn-danger" data-dismiss="modal"
                        aria-hidden="true">Dismiss</button></a>
                <button type="submit" class="close btn btn-success">Update</button>
            </div>
        </form>



    </body>

    </html>