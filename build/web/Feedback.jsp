<button type="button" id="myBtn"></button>
<br>
<button type="button" id="myBtn1">Chat</button>
<div class="modal" id="myModal">
    <!-- Modal content-->
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">&times;</button>
            <h4 class="modal-title">Give your Feedback here</h4>
        </div>
        <div class="modal-body">

            <form action="FeedbackSubmitServlet">
                <div class="form-group">
                    <label for="form_feedback">Feedback : </label>
                    <textarea name="feedback" class="form-control" rows="4" style="max-height: 200px;" required="required" data-error="Please leave us a feedback">
                    </textarea>
                </div>
                <input type="submit" value="Submit" class="btn btn-info pull-right"/>
                <br>
            </form>
        </div>
        <div class="modal-footer">

            <button type="button" class="btn btn-default" id='close1' data-dismiss="modal">Close</button>
        </div>
    </div>
</div>
<script>
            var modal = document.getElementById("myModal");
            var btn = document.getElementById("myBtn");
            var span = document.getElementsByClassName("close")[0];
            var close1 = document.getElementById('close1');

            btn.onclick = function () {
                modal.style.display = "block";
            }
            span.onclick = function () {
                modal.style.display = "none";
            }
            close1.onclick = function () {
                modal.style.display = "none";
            }

// When the user clicks anywhere outside of the modal, close it
            window.onclick = function (event) {
                if (event.target == modal) {
                    modal.style.display = "none";
                }
            }
            
            var btn1 = document.getElementById("myBtn1");
            btn1.onclick = function () {
                //alert("chat");
                window.location = 'UserServletForChat';
            }
</script>