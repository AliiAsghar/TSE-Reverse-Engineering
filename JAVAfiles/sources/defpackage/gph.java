package defpackage;

import android.os.Binder;
import android.os.IBinder;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.AnimationBackground;
import androidx.window.extensions.embedding.SplitAttributes;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gph {
    private static final String a;
    private final qdq c = new qdq(this, null);
    private final qdq b = new qdq(this, null);

    static {
        int i = arsc.a;
        a = new arrh(gph.class).c();
        new Binder();
    }

    public static final goy b(ActivityStack activityStack) {
        List activities;
        boolean isEmpty;
        ActivityStack.Token activityStackToken;
        activityStack.getClass();
        int d = d();
        if (d > 0 && d < 5) {
            return gvf.aU(activityStack);
        }
        activities = activityStack.getActivities();
        activities.getClass();
        isEmpty = activityStack.isEmpty();
        activityStackToken = activityStack.getActivityStackToken();
        return new goy(activities, isEmpty, activityStackToken);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0141, code lost:
    
        if (r8 != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.gqn c(androidx.window.extensions.embedding.SplitAttributes r8) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gph.c(androidx.window.extensions.embedding.SplitAttributes):gqn");
    }

    private static final int d() {
        return new xzg((byte[]) null).a;
    }

    private static final gpk e(AnimationBackground animationBackground) {
        int color;
        new xzg((byte[]) null).a(5);
        if (ry$$ExternalSyntheticApiModelOutline0.m$1(animationBackground)) {
            color = ry$$ExternalSyntheticApiModelOutline0.m469m((Object) animationBackground).getColor();
            return new gpi(color);
        }
        return gpk.a;
    }

    private static final gpl f(int i) {
        new xzg((byte[]) null).a(7);
        if (i == 0) {
            return gpl.b;
        }
        return gpl.a;
    }

    public final void a(List list) {
        gqp gqpVar;
        ActivityStack primaryActivityStack;
        ActivityStack secondaryActivityStack;
        SplitAttributes splitAttributes;
        SplitInfo.Token splitInfoToken;
        gqp gqpVar2;
        ActivityStack primaryActivityStack2;
        ActivityStack secondaryActivityStack2;
        SplitAttributes splitAttributes2;
        IBinder token;
        ActivityStack primaryActivityStack3;
        ActivityStack secondaryActivityStack3;
        SplitAttributes splitAttributes3;
        ActivityStack primaryActivityStack4;
        ActivityStack secondaryActivityStack4;
        float splitRatio;
        gqm aP;
        ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SplitInfo m479m = ry$$ExternalSyntheticApiModelOutline0.m479m(it.next());
            int d = d();
            if (d == 1) {
                m479m.getClass();
                primaryActivityStack4 = m479m.getPrimaryActivityStack();
                primaryActivityStack4.getClass();
                goy aU = gvf.aU(primaryActivityStack4);
                secondaryActivityStack4 = m479m.getSecondaryActivityStack();
                secondaryActivityStack4.getClass();
                goy aU2 = gvf.aU(secondaryActivityStack4);
                gqk gqkVar = new gqk();
                gqm gqmVar = gqm.a;
                splitRatio = m479m.getSplitRatio();
                if (splitRatio == gqm.a.d) {
                    aP = gqm.a;
                } else {
                    aP = gvf.aP(splitRatio);
                }
                gqkVar.b(aP);
                gqkVar.a = gql.a;
                gqpVar = new gqp(aU, aU2, gqkVar.a());
            } else {
                if (d == 2) {
                    qdq qdqVar = this.c;
                    m479m.getClass();
                    Object obj = qdqVar.a;
                    primaryActivityStack3 = m479m.getPrimaryActivityStack();
                    primaryActivityStack3.getClass();
                    goy aU3 = gvf.aU(primaryActivityStack3);
                    Object obj2 = qdqVar.a;
                    secondaryActivityStack3 = m479m.getSecondaryActivityStack();
                    secondaryActivityStack3.getClass();
                    goy aU4 = gvf.aU(secondaryActivityStack3);
                    Object obj3 = qdqVar.a;
                    splitAttributes3 = m479m.getSplitAttributes();
                    splitAttributes3.getClass();
                    gqpVar2 = new gqp(aU3, aU4, c(splitAttributes3));
                } else if (d < 3 || d >= 5) {
                    primaryActivityStack = m479m.getPrimaryActivityStack();
                    primaryActivityStack.getClass();
                    goy b = b(primaryActivityStack);
                    secondaryActivityStack = m479m.getSecondaryActivityStack();
                    secondaryActivityStack.getClass();
                    goy b2 = b(secondaryActivityStack);
                    splitAttributes = m479m.getSplitAttributes();
                    splitAttributes.getClass();
                    gqn c = c(splitAttributes);
                    splitInfoToken = m479m.getSplitInfoToken();
                    splitInfoToken.getClass();
                    gqpVar = new gqp(b, b2, c, null, splitInfoToken);
                } else {
                    qdq qdqVar2 = this.b;
                    m479m.getClass();
                    Object obj4 = qdqVar2.a;
                    primaryActivityStack2 = m479m.getPrimaryActivityStack();
                    primaryActivityStack2.getClass();
                    goy aU5 = gvf.aU(primaryActivityStack2);
                    Object obj5 = qdqVar2.a;
                    secondaryActivityStack2 = m479m.getSecondaryActivityStack();
                    secondaryActivityStack2.getClass();
                    goy aU6 = gvf.aU(secondaryActivityStack2);
                    Object obj6 = qdqVar2.a;
                    splitAttributes2 = m479m.getSplitAttributes();
                    splitAttributes2.getClass();
                    gqn c2 = c(splitAttributes2);
                    token = m479m.getToken();
                    token.getClass();
                    gqpVar2 = new gqp(aU5, aU6, c2, token);
                }
                gqpVar = gqpVar2;
            }
            arrayList.add(gqpVar);
        }
    }
}
