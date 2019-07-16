package com.ravi.commitsfromgit.pojo;

public class MyCommits {


    private String html_url;

    private Commit commit;

    private String comments_url;

    private String sha;

    private String url;

    private String node_id;




    public String getHtml_url ()
    {
        return html_url;
    }

    public void setHtml_url (String html_url)
    {
        this.html_url = html_url;
    }

    public Commit getCommit ()
    {
        return commit;
    }

    public void setCommit (Commit commit)
    {
        this.commit = commit;
    }

    public String getComments_url ()
    {
        return comments_url;
    }

    public void setComments_url (String comments_url)
    {
        this.comments_url = comments_url;
    }

    public String getSha ()
    {
        return sha;
    }

    public void setSha (String sha)
    {
        this.sha = sha;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getNode_id ()
    {
        return node_id;
    }

    public void setNode_id (String node_id)
    {
        this.node_id = node_id;
    }



    @Override
    public String toString()
    {
        return "ClassPojo [ html_url = "+html_url+", commit = "+commit+", comments_url = "+comments_url+", sha = "+sha+", url = "+url+", node_id = "+node_id+"]";
    }

    public static final class Commit
    {
        private String comment_count;

        private Committer committer;

        private Author author;

        private Tree tree;

        private String message;

        private String url;

        private Verification verification;

        public String getComment_count ()
        {
            return comment_count;
        }

        public void setComment_count (String comment_count)
        {
            this.comment_count = comment_count;
        }

        public Committer getCommitter ()
        {
            return committer;
        }

        public void setCommitter (Committer committer)
        {
            this.committer = committer;
        }

        public Author getAuthor ()
        {
            return author;
        }

        public void setAuthor (Author author)
        {
            this.author = author;
        }

        public Tree getTree ()
        {
            return tree;
        }

        public void setTree (Tree tree)
        {
            this.tree = tree;
        }

        public String getMessage ()
        {
            return message;
        }

        public void setMessage (String message)
        {
            this.message = message;
        }

        public String getUrl ()
        {
            return url;
        }

        public void setUrl (String url)
        {
            this.url = url;
        }

        public Verification getVerification ()
        {
            return verification;
        }

        public void setVerification (Verification verification)
        {
            this.verification = verification;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [comment_count = "+comment_count+", committer = "+committer+", author = "+author+", tree = "+tree+", message = "+message+", url = "+url+", verification = "+verification+"]";
        }
    }
    public static final  class Verification{
        private String reason;

        private String signature;

        private String payload;

        private String verified;

        public String getReason ()
        {
            return reason;
        }

        public void setReason (String reason)
        {
            this.reason = reason;
        }

        public String getSignature ()
        {
            return signature;
        }

        public void setSignature (String signature)
        {
            this.signature = signature;
        }

        public String getPayload ()
        {
            return payload;
        }

        public void setPayload (String payload)
        {
            this.payload = payload;
        }

        public String getVerified ()
        {
            return verified;
        }

        public void setVerified (String verified)
        {
            this.verified = verified;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [reason = "+reason+", signature = "+signature+", payload = "+payload+", verified = "+verified+"]";
        }
    }
    public static final class Tree
    {
        private String sha;

        private String url;

        public String getSha ()
        {
            return sha;
        }

        public void setSha (String sha)
        {
            this.sha = sha;
        }

        public String getUrl ()
        {
            return url;
        }

        public void setUrl (String url)
        {
            this.url = url;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [sha = "+sha+", url = "+url+"]";
        }
    }
    public static final  class Committer
    {
        private String date;

        private String name;

        private String email;

        public String getDate ()
        {
            return date;
        }

        public void setDate (String date)
        {
            this.date = date;
        }

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public String getEmail ()
        {
            return email;
        }

        public void setEmail (String email)
        {
            this.email = email;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [date = "+date+", name = "+name+", email = "+email+"]";
        }
    }
    public static final class Author
    {
        private String date;

        private String name;

        private String email;

        public String getDate ()
        {
            return date;
        }

        public void setDate (String date)
        {
            this.date = date;
        }

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public String getEmail ()
        {
            return email;
        }

        public void setEmail (String email)
        {
            this.email = email;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [date = "+date+", name = "+name+", email = "+email+"]";
        }
    }



}
