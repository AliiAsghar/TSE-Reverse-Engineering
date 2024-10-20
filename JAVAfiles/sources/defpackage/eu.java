package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eu {
    public final er a;
    private final int b;

    public eu(Context context) {
        this(context, ev.a(context, 0));
    }

    public final ev a() {
        ev create = create();
        create.show();
        return create;
    }

    public final void b(Drawable drawable) {
        this.a.c = drawable;
    }

    public final void c(CharSequence charSequence) {
        this.a.f = charSequence;
    }

    public ev create() {
        int i;
        ListAdapter listAdapter;
        ev evVar = new ev(this.a.a, this.b);
        AlertController alertController = evVar.a;
        er erVar = this.a;
        View view = erVar.e;
        if (view != null) {
            alertController.y = view;
        } else {
            CharSequence charSequence = erVar.d;
            if (charSequence != null) {
                alertController.a(charSequence);
            }
            Drawable drawable = erVar.c;
            if (drawable != null) {
                alertController.u = drawable;
                alertController.t = 0;
                ImageView imageView = alertController.v;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    alertController.v.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = erVar.f;
        if (charSequence2 != null) {
            alertController.e = charSequence2;
            TextView textView = alertController.x;
            if (textView != null) {
                textView.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = erVar.g;
        if (charSequence3 != null) {
            alertController.e(-1, charSequence3, erVar.h);
        }
        CharSequence charSequence4 = erVar.i;
        if (charSequence4 != null) {
            alertController.e(-2, charSequence4, erVar.j);
        }
        CharSequence charSequence5 = erVar.k;
        if (charSequence5 != null) {
            alertController.e(-3, charSequence5, erVar.l);
        }
        if (erVar.q != null || erVar.r != null) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) erVar.b.inflate(alertController.D, (ViewGroup) null);
            if (erVar.v) {
                listAdapter = new eo(erVar, erVar.a, alertController.E, erVar.q, recycleListView);
            } else {
                if (erVar.w) {
                    i = alertController.F;
                } else {
                    i = alertController.G;
                }
                listAdapter = erVar.r;
                if (listAdapter == null) {
                    listAdapter = new et(erVar.a, i, erVar.q);
                }
            }
            alertController.z = listAdapter;
            alertController.A = erVar.x;
            if (erVar.s != null) {
                recycleListView.setOnItemClickListener(new ep(erVar, alertController));
            } else if (erVar.y != null) {
                recycleListView.setOnItemClickListener(new eq(erVar, recycleListView, alertController));
            }
            if (erVar.w) {
                recycleListView.setChoiceMode(1);
            } else if (erVar.v) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f = recycleListView;
        }
        View view2 = erVar.t;
        if (view2 != null) {
            alertController.g = view2;
            alertController.h = 0;
            alertController.i = false;
        }
        evVar.setCancelable(this.a.m);
        if (this.a.m) {
            evVar.setCanceledOnTouchOutside(true);
        }
        evVar.setOnCancelListener(this.a.n);
        evVar.setOnDismissListener(this.a.o);
        DialogInterface.OnKeyListener onKeyListener = this.a.p;
        if (onKeyListener != null) {
            evVar.setOnKeyListener(onKeyListener);
        }
        return evVar;
    }

    public final void d(int i, DialogInterface.OnClickListener onClickListener) {
        er erVar = this.a;
        erVar.k = erVar.a.getText(i);
        erVar.l = onClickListener;
    }

    public final void e(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        er erVar = this.a;
        erVar.r = listAdapter;
        erVar.s = onClickListener;
        erVar.x = i;
        erVar.w = true;
    }

    public final void f(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        er erVar = this.a;
        erVar.q = charSequenceArr;
        erVar.s = onClickListener;
        erVar.x = i;
        erVar.w = true;
    }

    public final void g(int i) {
        er erVar = this.a;
        erVar.d = erVar.a.getText(i);
    }

    public Context getContext() {
        return this.a.a;
    }

    public final void h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        er erVar = this.a;
        erVar.i = charSequence;
        erVar.j = onClickListener;
    }

    public final void i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        er erVar = this.a;
        erVar.g = charSequence;
        erVar.h = onClickListener;
    }

    public eu setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        er erVar = this.a;
        erVar.i = erVar.a.getText(i);
        erVar.j = onClickListener;
        return this;
    }

    public eu setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        er erVar = this.a;
        erVar.g = erVar.a.getText(i);
        erVar.h = onClickListener;
        return this;
    }

    public eu setTitle(CharSequence charSequence) {
        this.a.d = charSequence;
        return this;
    }

    public eu setView(View view) {
        this.a.t = view;
        return this;
    }

    public eu(Context context, int i) {
        this.a = new er(new ContextThemeWrapper(context, ev.a(context, i)));
        this.b = i;
    }
}
