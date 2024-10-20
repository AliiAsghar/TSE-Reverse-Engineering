package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.SubMenu;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.d;
import defpackage.eco;
import defpackage.jx;
import defpackage.jz;
import defpackage.ke;
import defpackage.pd;
import defpackage.pe;
import defpackage.pf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ShareActionProvider extends eco {
    private static final int DEFAULT_INITIAL_ACTIVITY_COUNT = 4;
    public static final String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
    public final Context mContext;
    private int mMaxShownActivityCount;
    private jx mOnChooseActivityListener;
    private final pf mOnMenuItemClickListener;
    public pd mOnShareTargetSelectedListener;
    public String mShareHistoryFileName;

    public ShareActionProvider(Context context) {
        super(context);
        this.mMaxShownActivityCount = 4;
        this.mOnMenuItemClickListener = new pf(this, 0);
        this.mShareHistoryFileName = DEFAULT_SHARE_HISTORY_FILE_NAME;
        this.mContext = context;
    }

    private void setActivityChooserPolicyIfNeeded() {
        if (this.mOnShareTargetSelectedListener == null) {
            return;
        }
        if (this.mOnChooseActivityListener == null) {
            this.mOnChooseActivityListener = new pe(this);
        }
        jz e = jz.e(this.mContext, this.mShareHistoryFileName);
        jx jxVar = this.mOnChooseActivityListener;
        synchronized (e.b) {
            e.j = jxVar;
        }
    }

    @Override // defpackage.eco
    public boolean hasSubMenu() {
        return true;
    }

    @Override // defpackage.eco
    public View onCreateActionView() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.mContext);
        if (!activityChooserView.isInEditMode()) {
            jz e = jz.e(this.mContext, this.mShareHistoryFileName);
            ke keVar = activityChooserView.a;
            ActivityChooserView activityChooserView2 = keVar.d;
            jz jzVar = activityChooserView2.a.a;
            if (jzVar != null && activityChooserView2.isShown()) {
                jzVar.unregisterObserver(keVar.d.i);
            }
            keVar.a = e;
            if (keVar.d.isShown()) {
                e.registerObserver(keVar.d.i);
            }
            keVar.notifyDataSetChanged();
            if (activityChooserView.c()) {
                activityChooserView.d();
                activityChooserView.e();
            }
        }
        TypedValue typedValue = new TypedValue();
        this.mContext.getTheme().resolveAttribute(R.attr.actionModeShareDrawable, typedValue, true);
        activityChooserView.e.setImageDrawable(d.f(this.mContext, typedValue.resourceId));
        activityChooserView.h = this;
        activityChooserView.l = R.string.abc_shareactionprovider_share_with_application;
        activityChooserView.e.setContentDescription(activityChooserView.getContext().getString(R.string.abc_shareactionprovider_share_with));
        return activityChooserView;
    }

    @Override // defpackage.eco
    public void onPrepareSubMenu(SubMenu subMenu) {
        subMenu.clear();
        jz e = jz.e(this.mContext, this.mShareHistoryFileName);
        PackageManager packageManager = this.mContext.getPackageManager();
        int a = e.a();
        int min = Math.min(a, this.mMaxShownActivityCount);
        for (int i = 0; i < min; i++) {
            ResolveInfo c = e.c(i);
            subMenu.add(0, i, i, c.loadLabel(packageManager)).setIcon(c.loadIcon(packageManager)).setOnMenuItemClickListener(this.mOnMenuItemClickListener);
        }
        if (min < a) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.mContext.getString(R.string.abc_activity_chooser_view_see_all));
            for (int i2 = 0; i2 < a; i2++) {
                ResolveInfo c2 = e.c(i2);
                addSubMenu.add(0, i2, i2, c2.loadLabel(packageManager)).setIcon(c2.loadIcon(packageManager)).setOnMenuItemClickListener(this.mOnMenuItemClickListener);
            }
        }
    }

    public void setOnShareTargetSelectedListener(pd pdVar) {
        this.mOnShareTargetSelectedListener = pdVar;
        setActivityChooserPolicyIfNeeded();
    }

    public void setShareHistoryFileName(String str) {
        this.mShareHistoryFileName = str;
        setActivityChooserPolicyIfNeeded();
    }

    public void setShareIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                updateIntent(intent);
            }
        }
        jz e = jz.e(this.mContext, this.mShareHistoryFileName);
        synchronized (e.b) {
            if (e.g == intent) {
                return;
            }
            e.g = intent;
            e.i = true;
            e.f();
        }
    }

    public void updateIntent(Intent intent) {
        intent.addFlags(134742016);
    }
}
