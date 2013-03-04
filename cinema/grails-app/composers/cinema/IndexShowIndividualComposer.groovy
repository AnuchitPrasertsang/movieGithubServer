package cinema

import org.zkoss.zk.grails.composer.*
import org.zkoss.zk.ui.Executions
import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

class IndexShowIndividualComposer extends GrailsComposer {

    def afterCompose = { window ->

    	  $("#add").on('click',{
    
      Executions.sendRedirect("/indexIndividual.zul");
      })
               		def d = Individual.findAllByVersion(0)

								$('#gid > rows').append{
									row{ 
										label(value:d.firstName)
										label(value:d.lastName) 
										label(value:d.position)
										
									}
								}
					
    }
}