package kr.or.ddit.rms.shelter.sharing_info_board;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.rms.vo.Board_detailVO;

public class Sharing_info_boardSServiceImpl extends UnicastRemoteObject
		implements Sharing_info_boardSService, Serializable {
	Sharing_info_boardSDao dao;

	public Sharing_info_boardSServiceImpl() throws RemoteException {
		dao = Sharing_info_boardSDaoImpl.getInstance();
	}

	@Override
	public List<Board_detailVO> getBoard_detailAll() throws RemoteException {
		return dao.getBoard_detailAll();
	}

	@Override
	public List<Board_detailVO> getSearchBoard_detail(Board_detailVO vo) throws RemoteException {
		return dao.getSearchBoard_detail(vo);
	}

	@Override
	public List<Board_detailVO> getShare_detailTextSearch(Board_detailVO vo) throws RemoteException {
		return dao.getShare_detailTextSearch(vo);
	}

	@Override
	public int insertBoard_detail(Board_detailVO vo) throws RemoteException {
		return dao.insertBoard_detail(vo);
	}

	@Override
	public int updateBoard_detail(Board_detailVO vo) throws RemoteException {
		return dao.updateBoard_detail(vo);
	}

	@Override
	public int deleteBoard_detail(Board_detailVO vo) throws RemoteException {
		return dao.deleteBoard_detail(vo);
	}
}
