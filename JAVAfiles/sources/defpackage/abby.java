package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abby extends BaseExpandableListAdapter {
    public final ExpandableListView a;
    private final List b;
    private final LayoutInflater c;
    private final xux d;
    private final Context e;

    public abby(Context context, List list, xux xuxVar, ExpandableListView expandableListView) {
        this.e = context;
        this.b = list;
        this.c = (LayoutInflater) context.getSystemService("layout_inflater");
        this.d = xuxVar;
        this.a = expandableListView;
    }

    private final VCardAttachmentView a(ViewGroup viewGroup) {
        return (VCardAttachmentView) this.c.inflate(R.layout.people_list_item_view_m2, viewGroup, false);
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getChild(int i, int i2) {
        return ((ufb) this.b.get(i)).b.get(i2);
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        VCardAttachmentView vCardAttachmentView;
        if (view == null) {
            vCardAttachmentView = a(viewGroup);
        } else {
            vCardAttachmentView = (VCardAttachmentView) view;
        }
        vCardAttachmentView.h(new ufa((wpp) getChild(i, i2)));
        vCardAttachmentView.j(this.d);
        return vCardAttachmentView;
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i) {
        return ((ufb) this.b.get(i)).b.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getGroup(int i) {
        return this.b.get(i);
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        return this.b.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        VCardAttachmentView vCardAttachmentView;
        int i2;
        if (view == null) {
            vCardAttachmentView = a(viewGroup);
        } else {
            vCardAttachmentView = (VCardAttachmentView) view;
        }
        uez uezVar = new uez((ufb) getGroup(i));
        vCardAttachmentView.h(uezVar);
        Resources resources = this.e.getResources();
        String m = uezVar.m();
        if (true != z) {
            i2 = R.string.vcard_expand;
        } else {
            i2 = R.string.vcard_collapse;
        }
        vCardAttachmentView.setContentDescription(m + " " + resources.getString(i2));
        vCardAttachmentView.setOnClickListener(new abbx(this, i, 0));
        return vCardAttachmentView;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
