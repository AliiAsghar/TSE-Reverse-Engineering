package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kme extends no {
    public final alog c;
    private final armf d;
    private final armf e;
    private final RecyclerView f;
    private final znj g;

    public kme(znj znjVar, armf armfVar, armf armfVar2, RecyclerView recyclerView, alog alogVar) {
        this.g = znjVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = recyclerView;
        this.c = alogVar;
    }

    public final void F(int i) {
        q(i + 1);
    }

    public final void G() {
        boolean z;
        int m = m();
        if (m > 0) {
            z = true;
        } else {
            z = false;
        }
        aktp.L(new klo(z), this.f);
        aktp.L(new kln(m, Collection.EL.stream(this.c).mapToInt(new kmb(2)).sum()), this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(boolean z, int i, int i2) {
        kmk kmkVar = (kmk) this.c.get(i);
        kmj kmjVar = (kmj) kmkVar.c.get(i2);
        if (kmjVar.e != z) {
            kmjVar.e = z;
            if (z) {
                kmkVar.d++;
            } else {
                kmkVar.d--;
            }
        }
        F(i);
        G();
    }

    @Override // defpackage.no
    public final int b() {
        return this.c.size() + 1;
    }

    @Override // defpackage.no
    public final int c(int i) {
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    @Override // defpackage.no
    public final /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        View inflate;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            inflate = from.inflate(R.layout.header, viewGroup, false);
        } else {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            albo.T(z);
            inflate = from.inflate(R.layout.participant_message_list, viewGroup, false);
        }
        return new oo(inflate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        boolean z;
        boolean z2;
        int c = c(i);
        View view = ooVar.a;
        boolean z3 = false;
        int i2 = 1;
        if (c == 0) {
            TextView textView = (TextView) view;
            Context context = textView.getContext();
            String bs = yyb.bs(context);
            textView.setText(aabr.ab(context, this.d, this.e, context.getString(R.string.donation_header, bs), bs, kmp.a, kmp.b));
            ahnz.s(textView);
            ahnz.t(textView);
            return;
        }
        albo.T(true);
        final int i3 = i - 1;
        final kmk kmkVar = (kmk) this.c.get(i3);
        if (kmkVar.a() > 0) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.parent_checkbox);
        checkBox.setText(kmkVar.b);
        int a = kmkVar.a();
        int i4 = kmkVar.d;
        checkBox.setOnCheckedChangeListener(null);
        if (a == i4) {
            z2 = true;
        } else {
            z2 = false;
        }
        checkBox.setChecked(z2);
        checkBox.setOnCheckedChangeListener(new aaqw(this, i3, i2));
        int a2 = kmkVar.a();
        int i5 = kmkVar.d;
        Resources resources = view.getResources();
        TextView textView2 = (TextView) view.findViewById(R.id.selected_count);
        Integer valueOf = Integer.valueOf(i5);
        Integer valueOf2 = Integer.valueOf(a2);
        textView2.setText(resources.getString(R.string.donation_conversation_selected_count, valueOf, valueOf2));
        textView2.setContentDescription(resources.getString(R.string.donation_conversation_selected_count_of_total_count_content_description, resources.getQuantityString(R.plurals.donation_conversation_selected_count_content_description, i5, valueOf), resources.getQuantityString(R.plurals.donation_conversation_total_count_content_description, a2, valueOf2)));
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.message_list);
        LayoutInflater from = LayoutInflater.from(view.getContext());
        linearLayout.removeAllViews();
        final int i6 = 0;
        while (i6 < kmkVar.a()) {
            View inflate = from.inflate(R.layout.message, linearLayout, z3);
            CheckBox checkBox2 = (CheckBox) inflate.findViewById(R.id.checkbox);
            Context context2 = checkBox2.getContext();
            long b = kmkVar.b(i6);
            Spanned c2 = kmkVar.c(i6);
            String property = System.getProperty("line.separator");
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(context2.getResources().getDimensionPixelSize(R.dimen.checkbox_subtext_size));
            LayoutInflater layoutInflater = from;
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ahnz.f(context2, R.attr.colorOnSurfaceVariant, "DataDonationListAdapter#createMessageCheckboxText: failed to get color R.attr.colorOnSurfaceVariant"));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.valueOf(String.valueOf(c2)).concat(String.valueOf(property)));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(this.g.w(b));
            spannableStringBuilder.setSpan(absoluteSizeSpan, length, spannableStringBuilder.length(), 17);
            spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
            checkBox2.setText(spannableStringBuilder);
            checkBox2.setOnCheckedChangeListener(null);
            checkBox2.setChecked(kmkVar.e(i6));
            checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kmd
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                    kme.this.H(z4, i3, i6);
                }
            });
            ((ImageButton) inflate.findViewById(R.id.edit_button)).setOnClickListener(new View.OnClickListener() { // from class: kmc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    aktp.L(new kll(kmk.this, i3, i6), view2);
                }
            });
            linearLayout.addView(inflate);
            i6++;
            from = layoutInflater;
            z3 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int m() {
        return Collection.EL.stream(this.c).mapToInt(new kmb(0)).sum();
    }
}
