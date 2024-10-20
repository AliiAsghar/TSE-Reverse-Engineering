package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aahk extends aahj {
    private static final xze e = xze.g("Bugle", "WebSuggestedActionContainerViewHolder");
    private final xve f;
    private final Context g;
    private final RbmSuggestionData h;

    public aahk(xve xveVar, Context context, RbmSuggestionData rbmSuggestionData, View view) {
        super(context, rbmSuggestionData, view);
        this.f = xveVar;
        this.g = context;
        this.h = rbmSuggestionData;
    }

    @Override // defpackage.aahj
    public final Optional a(int i) {
        String str;
        String host;
        String propertyValue = this.h.b.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        if (propertyValue != null && (host = Uri.parse(propertyValue).getHost()) != null) {
            Iterator<E> it = ((aplg) psc.c.e()).b.iterator();
            while (it.hasNext()) {
                if (albo.ar((String) it.next(), host)) {
                    return f(this.g, R.drawable.product_logo_wallet_color_24, i, false);
                }
            }
        }
        Drawable drawable = null;
        if (TextUtils.isEmpty(propertyValue)) {
            e.l("No url; returning default icon");
        } else {
            Intent b = this.f.b(propertyValue);
            PackageManager packageManager = this.g.getPackageManager();
            if (packageManager == null) {
                e.l("Couldn't access package manager; returning default icon");
            } else {
                ResolveInfo resolveActivity = packageManager.resolveActivity(b, 0);
                if (resolveActivity != null && resolveActivity.activityInfo != null && !TextUtils.isEmpty(resolveActivity.activityInfo.packageName)) {
                    String str2 = resolveActivity.activityInfo.packageName;
                    if (!TextUtils.isEmpty(str2)) {
                        ResolveInfo resolveActivity2 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
                        if (resolveActivity2 != null && resolveActivity2.activityInfo != null && !TextUtils.isEmpty(resolveActivity2.activityInfo.packageName)) {
                            str = resolveActivity2.activityInfo.packageName;
                        } else {
                            str = null;
                        }
                        if (!TextUtils.equals(str2, str)) {
                            try {
                                e.l(a.cp(str2, "Returning icon for "));
                                drawable = packageManager.getApplicationIcon(str2);
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        }
                    }
                    e.l("No default app for url; returning default icon");
                } else {
                    e.l("Couldn't resolve package name; returning default icon");
                }
            }
        }
        if (drawable != null) {
            return Optional.of(this.d.g(drawable));
        }
        return f(this.g, R.drawable.business_web, i, true);
    }

    @Override // defpackage.aahj
    public final String b() {
        return aahj.g(this.g.getString(R.string.conversation_suggestion_launch_web_action), c());
    }
}
