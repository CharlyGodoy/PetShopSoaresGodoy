import { PetShopAngularPage } from './app.po';

describe('pet-shop-angular App', () => {
  let page: PetShopAngularPage;

  beforeEach(() => {
    page = new PetShopAngularPage();
  });

  it('should display welcome message', done => {
    page.navigateTo();
    page.getParagraphText()
      .then(msg => expect(msg).toEqual('Welcome to app!!'))
      .then(done, done.fail);
  });
});
