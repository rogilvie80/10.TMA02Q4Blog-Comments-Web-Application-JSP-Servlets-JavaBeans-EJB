/*
 * PostedCommentsBean.java
 *
 * @version 1.0
 */

package tma02_q4_ejbs;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;
import tma02_q4_beans.CommentBean;

/**
 *
 * @author m362
 */
@Stateful
public class PostedCommentsBean implements PostedCommentsLocal
{
   private List<CommentBean> comments;

   /**
     * Creates a new instance of PostedCommentsBean
     */
   public PostedCommentsBean()
   {
      comments = new ArrayList<CommentBean>();

      // Hard-coded "database" of customer comments
      CommentBean c1 = new CommentBean();
      c1.setName("Ludwig");
      c1.setComment("Phantastischen! Machen mir ein Broadwood.");
      comments.add(c1);

      CommentBean c2 = new CommentBean();
      c2.setName("A Lennon fan");
      c2.setComment("I can't believe that you are spreading old rumours like this after all these years. Shame on you !");
      comments.add(c2);

      CommentBean c3 = new CommentBean();
      c3.setName("A. Stradivari");
      c3.setComment("Lenin would have agreed with expropriation of bourgeois property by the proletariat.");
      comments.add(c3);
   }

   public void postComment(CommentBean bean)
   {
      comments.add(bean);
   }

   public List<CommentBean> getAllComments()
   {
      return comments;
   }

}

