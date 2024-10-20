package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ead {
    public Context a;
    public String b;
    public Intent[] c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public IconCompat h;
    public dzv[] i;
    public Set j;
    public eaa k;
    public boolean l;
    public int m;
    public PersistableBundle n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List a(Context context, List list) {
        String id;
        Intent[] intents;
        ComponentName activity;
        CharSequence shortLabel;
        CharSequence longLabel;
        CharSequence disabledMessage;
        Set categories;
        PersistableBundle extras;
        dzv[] dzvVarArr;
        PersistableBundle extras2;
        String string;
        eaa eaaVar;
        int rank;
        PersistableBundle extras3;
        LocusId locusId;
        LocusId locusId2;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ShortcutInfo m = ead$$ExternalSyntheticApiModelOutline0.m(it.next());
            ead eadVar = new ead();
            eadVar.a = context;
            id = m.getId();
            eadVar.b = id;
            m.getPackage();
            intents = m.getIntents();
            eadVar.c = (Intent[]) Arrays.copyOf(intents, intents.length);
            activity = m.getActivity();
            eadVar.d = activity;
            shortLabel = m.getShortLabel();
            eadVar.e = shortLabel;
            longLabel = m.getLongLabel();
            eadVar.f = longLabel;
            disabledMessage = m.getDisabledMessage();
            eadVar.g = disabledMessage;
            if (Build.VERSION.SDK_INT < 28) {
                m.isEnabled();
            } else {
                m.getDisabledReason();
            }
            categories = m.getCategories();
            eadVar.j = categories;
            extras = m.getExtras();
            if (extras != null && extras.containsKey("extraPersonCount")) {
                int i = extras.getInt("extraPersonCount");
                dzvVarArr = new dzv[i];
                int i2 = 0;
                while (i2 < i) {
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i3 = i2 + 1;
                    sb.append(i3);
                    PersistableBundle persistableBundle = extras.getPersistableBundle(sb.toString());
                    dzu dzuVar = new dzu();
                    dzuVar.a = persistableBundle.getString("name");
                    dzuVar.c = persistableBundle.getString(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                    dzuVar.d = persistableBundle.getString("key");
                    dzuVar.e = persistableBundle.getBoolean("isBot");
                    dzuVar.f = persistableBundle.getBoolean("isImportant");
                    dzvVarArr[i2] = new dzv(dzuVar);
                    i2 = i3;
                }
            } else {
                dzvVarArr = null;
            }
            eadVar.i = dzvVarArr;
            m.getUserHandle();
            m.getLastChangedTimestamp();
            if (Build.VERSION.SDK_INT >= 30) {
                m.isCached();
            }
            m.isDynamic();
            m.isPinned();
            m.isDeclaredInManifest();
            m.isImmutable();
            m.isEnabled();
            m.hasKeyFieldsOnly();
            if (Build.VERSION.SDK_INT < 29) {
                extras2 = m.getExtras();
                if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                    eaaVar = new eaa(string);
                }
                eaaVar = null;
            } else {
                locusId = m.getLocusId();
                if (locusId != null) {
                    locusId2 = m.getLocusId();
                    eaaVar = eaa.a(locusId2);
                }
                eaaVar = null;
            }
            eadVar.k = eaaVar;
            rank = m.getRank();
            eadVar.m = rank;
            extras3 = m.getExtras();
            eadVar.n = extras3;
            dym.d(eadVar, null, null);
            arrayList.add(eadVar);
        }
        return arrayList;
    }
}
