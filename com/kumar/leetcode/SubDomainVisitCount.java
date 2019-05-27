package com.kumar.leetcode;

import java.util.*;

public class SubDomainVisitCount {
    public static void main(String[] args) {
        SubDomainVisitCount visitCount = new SubDomainVisitCount();
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> result = visitCount.subdomainVisits(cpdomains);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public List<String> subdomainVisits2(String[] cpdomains) {
        List<String> result = new ArrayList<>();
        if(cpdomains.length==0)return null;

        return result;
    }

        public List<String> subdomainVisits(String[] cpdomains) {
            Map<String, Integer> counts = new HashMap<>();
            for (String domain: cpdomains) {
                String[] cpinfo = domain.split("\\s+");
                String[] frags = cpinfo[1].split("\\.");
                int count = Integer.valueOf(cpinfo[0]);
                String cur = "";
                for (int i = frags.length - 1; i >= 0; --i) {
                    cur = frags[i] + (i < frags.length - 1 ? "." : "") + cur;
                    System.out.println("cur:"+cur);
                    System.out.println(counts.getOrDefault(cur, 0) + count);
                    counts.put(cur, counts.getOrDefault(cur, 0) + count);
                }
            }

            List<String> ans = new ArrayList();
            for (String dom: counts.keySet())
                ans.add("" + counts.get(dom) + " " + dom);
            return ans;
        }

}
