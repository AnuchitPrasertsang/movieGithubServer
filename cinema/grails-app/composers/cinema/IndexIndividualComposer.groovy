package cinema

import org.zkoss.zk.grails.composer.*
import org.zkoss.zk.ui.Executions
import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

class IndexIndividualComposer extends GrailsComposer {

    def afterCompose = { window ->

//login

		
		$("#login").on("click", {

        	def user = Individual.findByUserIdAndPassword($("#user").val(), $("#pass").val())
        	if (user) {
        		session.user = user
        		redirect(uri:'/showTimesTicket.zul')
        	}else {
				$("#user").val(null)
				$("#pass").val(null)
			}
        })
        
		
		$("#clear").on("click", {

				$("#user").val(null)
				$("#pass").val(null)
			
        })


 //กรอกข้อมูล
                $('#btnsubmit').on('click',{
					def zz =new Individual(
					firstName : $('#namebox')[0].text,
					lastName : $('#lastnamebox')[0].text,
					number : $('#sebox')[0].text,
					date : $('#datebox')[0].text,
					status : $('#bbox')[0].text,
					address : $('#addressbox')[0].text,
					moo : $('#addbox')[0].text,
					district : $('#amphoebox')[0].text,
					canton : $('#ampbox')[0].text,
					county : $('#jnamebox')[0].text,
					post : $('#postbox')[0].text,
					phone : $('#berbox')[0].text,
					email : $('#maibox')[0].text,
					degree : $('#stbox')[0].text,
					major : $('#rbox')[0].text,
					university : $('#ubox')[0].text,
					position : $('#position')[0].text,
					userId : $('#usrbox')[0].text,
					password : $('#pasbox')[0].text,
					rePassword : $('#repassbox')[0].text
					)
					
					$('#namebox')[0].text = ""
					$('#lastnamebox')[0].text = ""
					$('#sebox')[0].text = ""
					$('#datebox')[0].text = ""
					$('#bbox')[0].text = ""
					$('#addressbox')[0].text = ""
					$('#addbox')[0].text = ""
					$('#amphoebox')[0].text = ""
					$('#ampbox')[0].text = ""
					$('#jnamebox')[0].text = ""
					$('#postbox')[0].text = ""
					$('#berbox')[0].text = ""
					$('#maibox')[0].text = ""
					$('#stbox')[0].text = ""
					$('#rbox')[0].text = ""
					$('#ubox')[0].text = ""
					$('#position')[0].text = ""
					$('#usrbox')[0].text = ""
					$('#pasbox')[0].text = ""
					$('#repassbox')[0].text = ""
					zz.save()
			})

    }
}