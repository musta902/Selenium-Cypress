import *as Digest_AuthPage from '../pages/Digest_AuthPage.spec'


describe ('Digest_Auth Testing', ()=>{
    

    
    it('Enter valid credentials and verify it', () => {
        
       // cy.visit('https://the-internet.herokuapp.com/')
       Digest_AuthPage.visitPage()
        
        cy.get(Digest_AuthPage.digest_Auth).click({force:true})
      
        Cypress.Commands.add("auth_digest", (username, password, baseUrl, text) =>
        {

        cy.visit(baseUrl, {
        auth: {
        username: username,
        password: password,
        },
        })
        cy.get('p').should('include.text',"Congratulations! You must have the proper credentials.")
        })

    })

})