package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class epw {
    private static final Object d = new Object();
    private static epw e;
    public final Context a;
    private final Handler g;
    public final HashMap b = new HashMap();
    private final HashMap f = new HashMap();
    public final ArrayList c = new ArrayList();

    private epw(Context context) {
        this.a = context;
        this.g = new epu(this, context.getMainLooper());
    }

    public static epw a(Context context) {
        epw epwVar;
        synchronized (d) {
            if (e == null) {
                e = new epw(context.getApplicationContext());
            }
            epwVar = e;
        }
        return epwVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.b) {
            epv epvVar = new epv(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(epvVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.f.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f.put(action, arrayList2);
                }
                arrayList2.add(epvVar);
            }
        }
    }

    public final void c(BroadcastReceiver broadcastReceiver) {
        synchronized (this.b) {
            ArrayList arrayList = (ArrayList) this.b.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    epv epvVar = (epv) arrayList.get(size);
                    epvVar.d = true;
                    for (int i = 0; i < epvVar.a.countActions(); i++) {
                        String action = epvVar.a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) this.f.get(action);
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            while (true) {
                                size2--;
                                if (size2 < 0) {
                                    break;
                                }
                                epv epvVar2 = (epv) arrayList2.get(size2);
                                if (epvVar2.b == broadcastReceiver) {
                                    epvVar2.d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f.remove(action);
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void d(Intent intent) {
        boolean z;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        synchronized (this.b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            if ((intent.getFlags() & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList arrayList3 = (ArrayList) this.f.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", a.ch(arrayList3, "Action list: "));
                }
                int i2 = 0;
                ArrayList arrayList4 = null;
                while (i2 < arrayList3.size()) {
                    epv epvVar = (epv) arrayList3.get(i2);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + epvVar.a);
                    }
                    if (epvVar.c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        arrayList = arrayList3;
                        arrayList2 = arrayList4;
                        i = i2;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                    } else {
                        i = i2;
                        arrayList = arrayList3;
                        arrayList2 = arrayList4;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        int match = epvVar.a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            if (arrayList2 == null) {
                                arrayList4 = new ArrayList();
                            } else {
                                arrayList4 = arrayList2;
                            }
                            arrayList4.add(epvVar);
                            epvVar.c = true;
                            i2 = i + 1;
                            action = str;
                            resolveTypeIfNeeded = str2;
                            arrayList3 = arrayList;
                        } else if (z) {
                            if (match != -4) {
                                if (match != -3) {
                                    if (match != -2) {
                                        if (match != -1) {
                                            str3 = "unknown reason";
                                        } else {
                                            str3 = BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE;
                                        }
                                    } else {
                                        str3 = GroupManagementRequest.DATA_TAG;
                                    }
                                } else {
                                    str3 = GroupManagementRequest.ACTION_TAG;
                                }
                            } else {
                                str3 = "category";
                            }
                            Log.v("LocalBroadcastManager", a.cp(str3, "  Filter did not match: "));
                        }
                    }
                    arrayList4 = arrayList2;
                    i2 = i + 1;
                    action = str;
                    resolveTypeIfNeeded = str2;
                    arrayList3 = arrayList;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((epv) arrayList5.get(i3)).c = false;
                    }
                    this.c.add(new fvq(intent, arrayList5, (byte[]) null));
                    if (!this.g.hasMessages(1)) {
                        this.g.sendEmptyMessage(1);
                    }
                }
            }
        }
    }
}
