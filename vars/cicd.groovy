def newGit(branch,repo)
{
   git branch: "${branch}", url: "${repo}"
}
def newMaven()
{
   sh "mvn clean package"
}
def newDepl(src,user,ip,appname)
{
   sshagent(['fff70456-64d3-4cda-80ba-e1682fe9ff90']) {
                        sh "scp -o strictHostKeyChecking=No target/${src}.war ${user}@${ip}:/opt//apache-tomcat-9.0.87/webapps/${appname}.war"
      }
}
