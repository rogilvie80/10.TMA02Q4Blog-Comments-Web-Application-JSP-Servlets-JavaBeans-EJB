package tma02_q4_ejbs;

import java.util.List;
import javax.ejb.Local;
import tma02_q4_beans.CommentBean;


/**
 * This is the business interface for the PostedComments enterprise bean.
 */
@Local
public interface PostedCommentsLocal
{
   void postComment(CommentBean bean);

   List<CommentBean> getAllComments();

}


