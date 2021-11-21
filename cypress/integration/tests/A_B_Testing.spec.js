import *as A_B_TestingPage from '..//pages/A_B_TestingPage.spec'

describe ('A/B Testing', ()=>{

it('Verify the title and the description', () => {
    //cy.visit('https://the-internet.herokuapp.com/')
    A_B_TestingPage.visitPage()

cy.get(A_B_TestingPage.abTestLinkCSS).click({force:true})

cy.url().should('eq','https://the-internet.herokuapp.com/abtest')

//cy.get(A_B_TestingPage.titleCSS).should('have.text','A/B Test Variation 1')|| cy.get(A_B_TestingPage.titleCSS).should('have.text','A/B Test Control')
cy.get(A_B_TestingPage.descriptionCSS).should('have.text',A_B_TestingPage.descriptionExpText)
   
   
});



})