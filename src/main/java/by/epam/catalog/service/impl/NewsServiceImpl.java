package by.epam.catalog.service.impl;

import by.epam.catalog.bean.News;
import by.epam.catalog.dao.NewsDAO;
import by.epam.catalog.dao.exception.DAOException;
import by.epam.catalog.dao.factory.DAOFactory;
import by.epam.catalog.service.NewsService;
import by.epam.catalog.service.exception.ServiceException;

/**
 * Class contains the implementation of the interface NewsService
 */
public class NewsServiceImpl implements NewsService {
  /**
   * method is for adding the new
   *
   * @param news - object of the class News
   * @throws ServiceException - exceptions caused by Service layer
   */
  @Override
  public void addNew(News news) throws ServiceException {
    try {
      DAOFactory daoObjectFactory = DAOFactory.getInstance();
      NewsDAO newsDAO = daoObjectFactory.getNewsDAO();
      newsDAO.addNew(news);
    } catch (DAOException e) {
      throw new ServiceException("Wrong data in adding new!NewsServiceImpl");
    }
  }

  /**
   * method is for finding the new by category
   *
   * @param category - new's category
   * @throws ServiceException - exceptions caused by Service layer
   */
  @Override
  public void findByCategory(String category) throws ServiceException {
    try {
      DAOFactory daoObjectFactory = DAOFactory.getInstance();
      NewsDAO newsDAO = daoObjectFactory.getNewsDAO();
      newsDAO.findByCategory(category);
    } catch (DAOException e) {
      throw new ServiceException("Fail while find the new by category!NewsServiceImpl");
    }
  }

  /**
   * method is for finding the new by title
   *
   * @param title - new's title
   * @throws ServiceException - exceptions caused by Service layer
   */
  @Override
  public void findByTitle(String title) throws ServiceException {
    try {
      DAOFactory daoObjectFactory = DAOFactory.getInstance();
      NewsDAO newsDAO = daoObjectFactory.getNewsDAO();
      newsDAO.findByTitle(title);
    } catch (DAOException e) {
      throw new ServiceException("Wrong data in finding news by title!NewsServiceImpl");
    }
  }

  /**
   * method is for finding the new by author
   *
   * @param author - new's author
   * @throws ServiceException - exceptions caused by Service layer
   */
  @Override
  public void findByAuthor(String author) throws ServiceException {
    try {
      DAOFactory daoObjectFactory = DAOFactory.getInstance();
      NewsDAO newsDAO = daoObjectFactory.getNewsDAO();
      newsDAO.findByAuthor(author);
    } catch (DAOException e) {
      throw new ServiceException("Wrong data in finding news by author!NewsServiceImpl");
    }
  }

  /**
   * method is for finding the new by date
   *
   * @param date - new's date
   * @throws ServiceException - exceptions caused by Service layer
   */
  @Override
  public void findByDate(String date) throws ServiceException {
    try {
      DAOFactory daoObjectFactory = DAOFactory.getInstance();
      NewsDAO newsDAO = daoObjectFactory.getNewsDAO();
      newsDAO.findByDate(date);
    } catch (DAOException e) {
      throw new ServiceException("Wrong data in finding news by date!NewsServiceImpl");
    }
  }
}
