def newGit(repo)
{
  git "${repo}"
}
def newMaven()
{
  sh 'mvn package'
}
def newDeply(ip,appname)
{
  sh "scp /var/lib/jenkins/workspace/DeclarativePipeline3/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
