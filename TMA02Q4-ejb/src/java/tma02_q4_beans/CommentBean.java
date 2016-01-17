/*
 * CommentBean.java
 *
 * @author M362
 * @version 1.0
 */

package tma02_q4_beans;

import java.beans.*;
import java.io.Serializable;
import java.util.Date;


public class CommentBean extends Object implements Serializable
{
   private String name;
   private String comment;
   private Date timeStamp;

   public CommentBean()
   {
       timeStamp = new Date(); // record the date and time of instantiation
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getComment()
   {
      return comment;
   }

   public void setComment(String comment)
   {
      this.comment = comment;
   }

   public Date getTimeStamp()
   {
      return timeStamp;
   }

}


