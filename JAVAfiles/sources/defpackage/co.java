package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.app.FragmentContainerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class co implements LayoutInflater.Factory2 {
    public final da a;

    public co(da daVar) {
        this.a = daVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        dg k;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.a);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ay.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                ClassLoader classLoader = context.getClassLoader();
                int i = cm.a;
                try {
                    if (cg.class.isAssignableFrom(cm.a(classLoader, attributeValue))) {
                        int id = view != null ? view.getId() : 0;
                        if (id == -1) {
                            if (resourceId != -1) {
                                id = -1;
                            } else {
                                if (string == null) {
                                    throw new IllegalArgumentException(a.cf(attributeValue, attributeSet, ": Must specify unique android:id, android:tag, or have a parent with an id for "));
                                }
                                id = -1;
                                resourceId = -1;
                            }
                        }
                        cg d = resourceId != -1 ? this.a.d(resourceId) : null;
                        if (d == null && string != null) {
                            d = this.a.e(string);
                        }
                        if (d == null && id != -1) {
                            d = this.a.d(id);
                        }
                        if (d == null) {
                            cm i2 = this.a.i();
                            context.getClassLoader();
                            d = i2.b(attributeValue);
                            d.v = true;
                            d.F = resourceId != 0 ? resourceId : id;
                            d.G = id;
                            d.H = string;
                            d.w = true;
                            d.B = this.a;
                            da daVar = this.a;
                            d.C = daVar.n;
                            Context context2 = daVar.n.c;
                            d.aE(attributeSet, d.h);
                            k = this.a.j(d);
                            if (da.Y(2)) {
                                Log.v("FragmentManager", "Fragment " + d + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                            }
                        } else if (!d.w) {
                            d.w = true;
                            d.B = this.a;
                            da daVar2 = this.a;
                            d.C = daVar2.n;
                            Context context3 = daVar2.n.c;
                            d.aE(attributeSet, d.h);
                            k = this.a.k(d);
                            if (da.Y(2)) {
                                Log.v("FragmentManager", "Retained Fragment " + d + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                            }
                        } else {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        int i3 = emb.a;
                        d.getClass();
                        emc emcVar = new emc(d, viewGroup);
                        emb.d(emcVar);
                        ema b = emb.b(d);
                        if (b.b.contains(elz.DETECT_FRAGMENT_TAG_USAGE) && emb.e(b, d.getClass(), emcVar.getClass())) {
                            emb.c(b, emcVar);
                        }
                        d.P = viewGroup;
                        k.e();
                        k.d();
                        View view2 = d.Q;
                        if (view2 != null) {
                            if (resourceId != 0) {
                                view2.setId(resourceId);
                            }
                            if (d.Q.getTag() == null) {
                                d.Q.setTag(string);
                            }
                            d.Q.addOnAttachStateChangeListener(new agav(this, k, 1));
                            return d.Q;
                        }
                        throw new IllegalStateException(a.bW(attributeValue, "Fragment ", " did not create a view."));
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
