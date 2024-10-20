package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zlv extends akhz {
    final /* synthetic */ LayoutInflater a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ zly f;

    public zlv(zly zlyVar, LayoutInflater layoutInflater, int i, int i2, int i3, int i4) {
        this.a = layoutInflater;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = zlyVar;
    }

    @Override // defpackage.akhz
    public final View a(ViewGroup viewGroup) {
        View inflate = this.a.inflate(R.layout.sim_messages_list_item_view, viewGroup, false);
        ((aohs) this.f.g.b()).t(inflate, new ynw(inflate, 4));
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v12, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.akhz
    public final /* synthetic */ void b(View view, Object obj) {
        String str;
        boolean z;
        String str2;
        ?? r6;
        String string;
        String string2;
        zlo zloVar = (zlo) obj;
        TextView textView = (TextView) view.findViewById(R.id.message_text);
        TextView textView2 = (TextView) view.findViewById(R.id.message_sender_name);
        TextView textView3 = (TextView) view.findViewById(R.id.message_timestamp);
        String str3 = zloVar.a;
        textView.setText(str3);
        msh mshVar = zloVar.b;
        if (mshVar == null) {
            str = null;
        } else {
            str = mshVar.G(((Boolean) new mst(13).get()).booleanValue()).a;
        }
        textView2.setText(str);
        String str4 = zloVar.c;
        textView3.setText(str4);
        int i = zloVar.d;
        view.setTag(R.id.sim_message_index_tag, Integer.valueOf(i));
        int i2 = this.f.m;
        if (i2 != -1 && i2 == i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            view.setBackgroundColor(this.b);
            textView.setTextColor(this.c);
            textView2.setTextColor(this.c);
            textView3.setTextColor(this.c);
        } else {
            view.setBackgroundColor(this.d);
            textView.setTextColor(this.e);
            textView2.setTextColor(this.e);
            textView3.setTextColor(this.e);
        }
        if (((Boolean) ((utz) zly.b.get()).e()).booleanValue()) {
            zly zlyVar = this.f;
            msh mshVar2 = zloVar.b;
            r6 = new SpannableStringBuilder();
            if (zlyVar.c()) {
                Resources resources = zlyVar.c.x().getResources();
                if (z) {
                    string2 = resources.getString(R.string.action_selected);
                } else {
                    string2 = resources.getString(R.string.action_unselected);
                }
                r6.append(string2);
            }
            if (str3 != null) {
                if (r6.length() > 0) {
                    r6.append(' ');
                }
                r6.append(str3);
            }
            if (mshVar2 != null) {
                if (r6.length() > 0) {
                    r6.append(' ');
                }
                SpannableString a = ((xwr) zlyVar.i.b()).a(mshVar2);
                r6.append(a, a, 0);
            }
            if (str4 != null) {
                if (r6.length() > 0) {
                    r6.append(' ');
                }
                r6.append(str4);
            }
        } else {
            zly zlyVar2 = this.f;
            msh mshVar3 = zloVar.b;
            Context x = zlyVar2.c.x();
            boolean c = zlyVar2.c();
            Resources resources2 = x.getResources();
            if (mshVar3 != null) {
                String str5 = xwr.a;
                str2 = xwr.d(resources2, albo.ag(mshVar3.G(((Boolean) new msn(19).get()).booleanValue()).a));
            } else {
                str2 = "";
            }
            String str6 = albo.ag(str3) + " " + str2 + " " + albo.ag(str4);
            if (c) {
                if (z) {
                    string = resources2.getString(R.string.action_selected);
                } else {
                    string = resources2.getString(R.string.action_unselected);
                }
                r6 = String.valueOf(string).concat(str6);
            } else {
                r6 = str6;
            }
        }
        view.setContentDescription(r6);
    }
}
