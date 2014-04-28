package com.cloud.ui;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.cloud.R;
import com.cloud.bean.MenuItem;
import com.cloud.control.MenuItemAdapter;

public class FindFragment extends Fragment {
	private GridView gv_menu;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_find, container, false);
		findView(view);
		init();
		return view;
	}

	private void findView(View v) {
		gv_menu = (GridView) v.findViewById(R.id.gv_menu);
	}

	private void init() {
		List<MenuItem> menus = new ArrayList<MenuItem>();
		menus.add(new MenuItem(R.drawable.menu_leidian, "�����ֻ���Դ", "������ ���� ��ֽ ����"));
		menus.add(new MenuItem(R.drawable.menu_downloaded, "������", "����������"));
		menus.add(new MenuItem(R.drawable.menu_photo, "ͼƬ", ""));
		menus.add(new MenuItem(R.drawable.menu_video, "��Ƶ", ""));
		menus.add(new MenuItem(R.drawable.menu_file, "�ĵ�", ""));
		menus.add(new MenuItem(R.drawable.menu_music, "����", ""));
		// ����margin
		int margin = (int) (getResources().getDisplayMetrics().density * 14 * 13 / 9);
		MenuItemAdapter adapter = new MenuItemAdapter(getActivity(), menus, margin);
		gv_menu.setAdapter(adapter);
	}
}