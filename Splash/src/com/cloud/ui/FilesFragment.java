package com.cloud.ui;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListView;
import android.widget.PopupWindow;

import com.cloud.R;
import com.cloud.bean.FileItem;
import com.cloud.control.FileItemAdapter;

public class FilesFragment extends Fragment implements OnClickListener {
	private ListView lv_files;
	private PopupWindow menu;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_files, container, false);
		findView(view);
		init();
		return view;
	}

	private void findView(View v) {
		lv_files = (ListView) v.findViewById(R.id.lv_files);
	}

	private void init() {
		List<FileItem> files = new ArrayList<FileItem>();
		files.add(new FileItem(R.drawable.folder, "����", ""));
		files.add(new FileItem(R.drawable.apk, "Baidu.apk", "18.3K �޸�ʱ��:2012-12-08"));
		files.add(new FileItem(R.drawable.avi, "���� ����.avi", "28.3M �޸�ʱ��:2013-09-18"));
		files.add(new FileItem(R.drawable.epub, "����˵������.epub", "18.3B �޸�ʱ��:2012-12-08"));
		files.add(new FileItem(R.drawable.mkv, "������.mkv", "18.3K �޸�ʱ��:2012-12-08"));
		files.add(new FileItem(R.drawable.pdf, "��ӭ.pdf", "183.3K �޸�ʱ��:2012-12-08"));
		files.add(new FileItem(R.drawable.zip, "��Ϸ.zip", "13.3B �޸�ʱ��:2012-04-08"));
		files.add(new FileItem(R.drawable.rar, "����.rar", "8.3G �޸�ʱ��:2012-12-08"));
		files.add(new FileItem(R.drawable.txt, "����.txt", "18.3K �޸�ʱ��:2012-12-08"));

		View menuView = LayoutInflater.from(getActivity()).inflate(R.layout.pop_menu, null);
		// δ���
		menu = new PopupWindow(menuView, LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		menu.setFocusable(false);
		menu.setOutsideTouchable(false);

		FileItemAdapter adapter = new FileItemAdapter(getActivity(), files, this);
		lv_files.setAdapter(adapter);
	}

	@Override
	public void onClick(View v) {
		showPopupWindows(v);
	}

	private void showPopupWindows(View v) {
		// menu.showAtLocation(v, Gravity.CENTER, 0, 0);
	}
}