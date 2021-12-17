import *as Digest_AuthPage from '../pages/Digest_AuthPage.spec'


describe ('Digest_Auth Testing', ()=>{
    

    
    it('Enter valid credentials and verify it', () => {
        
       // cy.visit('https://the-internet.herokuapp.com/')
       Digest_AuthPage.visitPage()
        
        cy.get(Digest_AuthPage.digest_Auth).click({force:true})

        cy.auth_digest(Cypress.config("username"),Cypress.config("password"),Cypress.config("baseUrl"),"Congratulations! You must have the proper credentials.")
        
      
       

    })

})